package com.paymentcomponents.common.log

/**
 * Created by aalexandrakis on 06/04/2017.
 */
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import javax.servlet.http.HttpServletRequest

/**
 * User: a.alexandrakis
 * Date: 29/09/14
 */
class RequestLogger {
    Logger logger

    public RequestLogger(String name) {
        logger = LoggerFactory.getLogger(name)
    }

    static String log(String format, HttpServletRequest httpServletRequest, def object, String user, Closure callback) {
        format += ": ${(httpServletRequest ? httpServletRequest.method + " to " + httpServletRequest.servletPath : '')}"
        format += ": User : ${user}"
        format += ": Payload : ${object.toString()}"
        callback.call(format, null)
    }

    public void trace(String format, HttpServletRequest httpServletRequest, Object object = null, String user = null) {
        log(format, httpServletRequest, object, user) { msg, args ->
            logger.trace(msg, args)
        }
    }

    public void info(String format, HttpServletRequest httpServletRequest, Object object = null, String user = null) {
        log(format, httpServletRequest, object, user) { msg, args ->
            logger.info(msg, args)
        }
    }

    public void warn(String format, HttpServletRequest httpServletRequest, Object object = null, String user = null) {
        log(format, httpServletRequest, object, user) { msg, args ->
            logger.warn(msg, args)
        }
    }

    public void error(String format, HttpServletRequest httpServletRequest, Object object = null, String user = null, Throwable throwable = null) {
        log(format, httpServletRequest, object, user) { msg, args ->
            logger.error(msg, throwable)
        }
    }

    public void debug(String format, HttpServletRequest httpServletRequest, Object object = null, String user = null) {
        log(format, httpServletRequest, object, user) { msg, args ->
            logger.debug(msg, args)
        }
    }
}