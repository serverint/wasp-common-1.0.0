package com.paymentcomponents.common.request

/**
 * Created by aalexandrakis on 31/03/2017.
 */
class GatewayLoginRequest {
    String userEmail
    String password

    @Override
    public String toString() {
        return "GatewayLoginRequest{" +
                "userEmail='" + userEmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
