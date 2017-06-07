package com.paymentcomponents.common

import com.paymentcomponents.common.log.RequestLogger

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletRequestWrapper
import javax.servlet.http.HttpServletResponseWrapper
import java.security.MessageDigest
import java.util.regex.Matcher
import java.util.regex.Pattern
/**
 * Created by aalexandrakis on 08/04/2017.
 */
class Utils {
    static final RequestLogger logger = new RequestLogger("c.p.common.Utils")

    public
    static boolean filterUri(String currentVerb, String currentPath, String[] verbsToExclude, String[] pathsToExclude) {
        if (verbsToExclude != null && verbsToExclude.contains(currentVerb)) {
            logger.debug("Ignore Filtering $currentVerb - $currentPath due to VERB rule", null, null)
            return false
        } else if (pathMatches(pathsToExclude, currentPath)) {
            logger.debug("Ignore Filtering $currentVerb - $currentPath due to path rule", null, null, null)
            return false
        }

        logger.debug("Filtering $currentVerb - $currentPath  ", null, null, null)
        return true
    }

    static boolean pathMatches(String[] pathsToExclude, String currentPath) {
        boolean found = false
        pathsToExclude.any {
            it ->
                if (currentPath.matches(it.trim())) {
                    found = true
                    return found
                }
        }
        return found
    }

    public static def getObjectProperties(def a) {
        def propsMap = a.properties
        propsMap.remove('metaClass')
        propsMap.remove('class')
        propsMap
    }

    public static boolean enumContains(Class enumClass, String value) {
        try {
            enumClass.valueOf(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String normalizeHostName(String host) {
        Pattern pattern = Pattern.compile("^(.+[0-9a-z])\\.(.+[0-9a-z])\\.(.+[a-z])")
        Matcher matcher = pattern.matcher(host)
        if (matcher.find()) { //sub.example.com
            return matcher.group(matcher.groupCount() - 1) + '.' + matcher.group(matcher.groupCount())
        } else {
            Pattern pattern2 = Pattern.compile("^(.+[0-9a-z])\\.(.+[a-z])")
            Matcher matcher2 = pattern2.matcher(host)
            if (matcher2.find()) { //example.com
                return matcher2.group(1) + '.' + matcher2.group(2)
            } else { //example.com:0000
                return host.contains(":") ? host.substring(0, host.indexOf(":")) : host
            }
        }
    }

    public static def getHeadersFromHttpServletRequest(HttpServletRequest request) {
        Map<String, String> map = new HashMap<String, String>();

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }

        return map;
    }

    public static String getPayloadFromHttpServletRequest(HttpServletRequestWrapper request) {
        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                jb.append(line);
            }
        } catch (Exception e) { /*report an error*/
        }
        return jb.toString();
    }

    public static String getPayloadFromHttpServletResponse(HttpServletResponseWrapper response) {
        StringBuffer jb = new StringBuffer();
        String line = null;
        try {

            // todo add body from response

        } catch (Exception e) { /*report an error*/
        }
        return jb.toString();
    }

    public static String hashSHA256(String input) {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(input.getBytes());

        def byteData = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        System.out.println("Hex format : " + sb.toString());

        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }
}
