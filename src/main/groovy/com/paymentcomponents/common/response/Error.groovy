package com.paymentcomponents.common.response

import com.fasterxml.jackson.databind.ObjectMapper

/**
 * Created by aalexandrakis on 19/03/2017.
 */
class Error {
    String error
    String error_description

    Error() {
    }


    Error(String error, String error_description) {
        this.error = error
        this.error_description = error_description
    }

    @Override
    public String toString() {
        return new ObjectMapper().writeValueAsString(this)
    }
}
