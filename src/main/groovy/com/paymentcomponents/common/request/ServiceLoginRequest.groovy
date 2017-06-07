package com.paymentcomponents.common.request

/**
 * Created by aalexandrakis on 31/03/2017.
 */
class ServiceLoginRequest {
    String userEmail
    String password
    String referrer
    String referrerIp
    String userAgent
    String cookie


    @Override
    public String toString() {
        return "ServiceLoginRequest{" +
                "userEmail='" + userEmail + '\'' +
                ", referrer='" + referrer + '\'' +
                ", referrerIp='" + referrerIp + '\'' +
                ", userAgent='" + userAgent + '\'' +
                '}';
    }
}
