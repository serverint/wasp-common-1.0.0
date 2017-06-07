package com.paymentcomponents.common.response

/**
 * Created by aalexandrakis on 02/04/2017.
 */
class JWTResponse {
    String cookie
    String userEmail
    String userName
    List<String> permissions
    String csrfToken
}
