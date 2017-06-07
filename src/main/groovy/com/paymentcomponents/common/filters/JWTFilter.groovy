package com.paymentcomponents.common.filters

import com.fasterxml.jackson.databind.ObjectMapper
import com.paymentcomponents.common.Constants
import com.paymentcomponents.common.Utils
import com.paymentcomponents.common.log.RequestLogger
import com.paymentcomponents.common.models.HttpStatusReason
import com.paymentcomponents.common.models.IdentityToken
import com.paymentcomponents.common.response.Error
import org.springframework.core.ParameterizedTypeReference
import org.springframework.core.env.Environment
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.RestTemplate

import javax.servlet.*
import javax.servlet.http.*

/**
 * Created by aalexandrakis on 03/04/2017.
 */
/**
 * Created by aalexandrakis on 17/10/2016.
 * This filter check the token validity
 */
class JWTFilter implements Filter {

    @Override
    public void destroy() {
        // Do nothing
    }
    private RestTemplate restTemplate
    private static Environment env

    public JWTFilter(RestTemplate restTemplate, Environment env) {
        this.restTemplate = restTemplate
        this.env = env
    }

    @Override
    void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        RequestLogger logger = new RequestLogger(this.class.name)

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletRequestWrapper req = new HttpServletRequestWrapper(request);
        HttpServletResponseWrapper resp = new HttpServletResponseWrapper((HttpServletResponse) servletResponse);
        String requestUri = req.getServletPath()
        if (Utils.filterUri(req.method, requestUri, "OPTIONS".split(","), env.getProperty(Constants.IGNORE_JWT_FILTERS_PATHS_KEY).split(","))) {
            logger.info("Apply JWT validations", req)
            String host = Utils.normalizeHostName(req.getHeader("host"))

            Cookie cookie = request.getCookies().find {
                it.name.toString().trim().equals(Constants.IDENTITY_COOKIE_PREFIX + host)
            }
            if (!cookie) {
                resp.status = HttpStatus.UNAUTHORIZED.value()
                OutputStream os = resp.getOutputStream()
                os.write(new Error("unauthorized", "Please login.").toString().getBytes("UTF-8"))
                os.flush()
                os.close()
                logger.debug("Anonymous Session started", req)
            } else {
                IdentityToken identityToken = null
                try {
                    HttpHeaders headers = new HttpHeaders()
                    headers.add(Constants.XSRF_TOKEN, req.getHeader(Constants.XSRF_TOKEN))
                    identityToken = restTemplate.exchange("http://identity-service/token/validate?token={token}", HttpMethod.GET, new HttpEntity<Object>(null, headers), new ParameterizedTypeReference<IdentityToken>() {
                    }, URLEncoder.encode(cookie?.value, "UTF-8"))?.body
                    req.setAttribute(Constants.IDENTITY_TOKEN, identityToken)
                    logger.info("Incoming request", req, ((IdentityToken) req.getAttribute(Constants.IDENTITY_TOKEN)), ((IdentityToken) req.getAttribute(Constants.IDENTITY_TOKEN))?.userEmail)
                } catch (HttpClientErrorException ex) {
                    errorResponse(resp, ex)
                    logger.error("${ex.statusCode} - ${ex.responseBodyAsString}", (HttpServletRequest) servletRequest, identityToken, identityToken?.userEmail, ex)
                    return
                } catch (Exception ex1) {
                    errorResponse(resp, ex1)
                    logger.error("Exception while validating the JWT", (HttpServletRequest) servletRequest, identityToken, identityToken?.userEmail, ex1)
                    return
                }
            }
        } else {
            logger.debug("Ignoring JWT validations", req, null)
        }
        filterChain.doFilter(req, resp)
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // Do nothing
    }

    static errorResponse(HttpServletResponse resp, def ex) {
        if (ex instanceof HttpClientErrorException) {
            resp.setStatus(ex.statusCode.value())
            resp.setContentLength(ex.getResponseBodyAsString().length())
            resp.setContentType("application/json")
            PrintWriter pw = resp.getWriter()
            pw.print(ex.getResponseBodyAsString())
            pw.flush()
        } else if (ex instanceof Exception) {
            HttpStatusReason httpStatusReason = (HttpStatusReason) Constants.REST_ERRORS['internal_error']
            resp.setStatus(httpStatusReason.code.value())
            Error error = new Error('internal_error', httpStatusReason.error_description)
            resp.setContentLength(error.toString().length())
            resp.setContentType("application/json")
            PrintWriter pw = resp.getWriter()
            pw.print(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(error))
        }
    }
}