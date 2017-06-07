package com.paymentcomponents.common.request

/**
 * Created by aalexandrakis on 31/03/2017.
 */
class InitRequest {
    String userEmail
    String referrer
    String referrerIp
    String userAgent
    String cookie


    @Override
    public String toString() {
        return "InitRequest{" +
                "userEmail='" + userEmail + '\'' +
                ", referrer='" + referrer + '\'' +
                ", referrerIp='" + referrerIp + '\'' +
                ", userAgent='" + userAgent + '\'' +
                '}';
    }
}
