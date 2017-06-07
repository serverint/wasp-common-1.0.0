package com.paymentcomponents.common.filters

import com.fasterxml.jackson.databind.ObjectMapper
import com.paymentcomponents.common.Constants
import com.paymentcomponents.common.Utils
import com.paymentcomponents.common.log.RequestLogger
import com.paymentcomponents.common.models.ApiIdentityToken
import com.paymentcomponents.common.models.HttpStatusReason
import com.paymentcomponents.common.models.IdentityToken
import com.paymentcomponents.common.response.Error
import org.springframework.core.env.Environment
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.RestTemplate

import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.FilterConfig
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletRequestWrapper
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpServletResponseWrapper

/**
 * Created by John on 25/5/2017.
 */
class JATFilter implements Filter {

    @Override
    public void destroy() {
        // Do nothing
    }

    private RestTemplate restTemplate
    private static Environment env

    public JATFilter(RestTemplate restTemplate, Environment env) {
        this.restTemplate = restTemplate
        this.env = env
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // Do nothing
    }

    @Override
    void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        RequestLogger logger = new RequestLogger(this.class.name)

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletRequestWrapper req = new HttpServletRequestWrapper(request);
        HttpServletResponseWrapper resp = new HttpServletResponseWrapper((HttpServletResponse) servletResponse);
        String requestUri = req.getServletPath()

        if (Utils.filterUri(req.method, requestUri, "OPTIONS".split(","), env.getProperty(Constants.IGNORE_JAT_FILTERS_PATHS_KEY).split(","))) {
            logger.info("Apply JAT validations", req)

            String jat = req.getHeader("JAT")

            if(!jat) {
                resp.status = HttpStatus.UNAUTHORIZED.value()
                OutputStream os = resp.getOutputStream()
                os.write(new Error("unauthorized", "Please specify a JTA.").toString().getBytes("UTF-8"))
                os.flush()
                os.close()
                logger.debug("Anonymous Session started", req)
            } else {
                ApiIdentityToken apiIdentityToken = null
                try {
                    HttpHeaders headers = new HttpHeaders()
                    headers.setContentType(MediaType.MULTIPART_FORM_DATA)
                    MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
                    map.add("jat", jat)
                    HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(map, headers)

                    apiIdentityToken = restTemplate.postForEntity("http://identity-service/api/token/validate", requestEntity, ApiIdentityToken.class)?.body
                    logger.info("Incoming request", req, ((IdentityToken) req.getAttribute(Constants.IDENTITY_TOKEN)), ((IdentityToken) req.getAttribute(Constants.IDENTITY_TOKEN))?.userEmail)
                } catch (HttpClientErrorException ex) {
                    errorResponse(resp, ex)
                    logger.error("${ex.statusCode} - ${ex.responseBodyAsString}", (HttpServletRequest) servletRequest, apiIdentityToken, apiIdentityToken?.userId?.toString(), ex)
                    return
                } catch (Exception ex1) {
                    errorResponse(resp, ex1)
                    logger.error("Exception while validating the JAT", (HttpServletRequest) servletRequest, apiIdentityToken, apiIdentityToken?.userId?.toString(), ex1)
                    return
                }
            }

        } else {
            logger.debug("Ignoring JAT validations", req, null)
        }
        filterChain.doFilter(req, resp)
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
