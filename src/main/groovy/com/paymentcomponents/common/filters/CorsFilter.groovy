package com.paymentcomponents.common.filters

import com.paymentcomponents.common.log.RequestLogger
import org.springframework.core.env.Environment

import javax.servlet.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletRequestWrapper
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpServletResponseWrapper

/**
 * Created by aalexandrakis on 03/04/2017.
 */
/**
 * Created by aalexandrakis on 17/10/2016.
 * This filter check the token validity
 */
class CorsFilter implements Filter {

    @Override
    public void destroy() {
        // Do nothing
    }
    private static Environment env

    public CorsFilter(Environment env) {
        this.env = env
    }

    @Override
    void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        RequestLogger logger = new RequestLogger(this.class.name)

        HttpServletRequestWrapper req = new HttpServletRequestWrapper((HttpServletRequest) servletRequest);
        HttpServletResponseWrapper resp = new HttpServletResponseWrapper((HttpServletResponse) servletResponse);

        logger.debug("Apply CORS Headers", req, null)
        /**This is the first step of the incoming request.
         Get the start time and the reuqest body and store them to the request attributes.**/
        req.setAttribute("startTime", new Date());

        /**Add CORS headers.**/
        resp.setHeader("Access-Control-Expose-Headers", env.getProperty("endpoints.cors.exposed-headers").toString())
        resp.setHeader("Access-Control-Allow-Headers", env.getProperty("endpoints.cors.allowed-headers").toString())
        resp.setHeader("Access-Control-Allow-Methods", env.getProperty("endpoints.cors.allowed-methods").toString())
        resp.setHeader("Access-Control-Allow-Origin", env.getProperty("endpoints.cors.allowed-origins").toString())
        resp.setHeader("Access-Control-Allow-Credentials", env.getProperty("endpoints.cors.allow-credentials").toString())

        filterChain.doFilter(req, resp)
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // Do nothing
    }

}