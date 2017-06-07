package com.paymentcomponents.common.response

import com.paymentcomponents.common.request.AccountBlockUnblockRequest

class AccountBlockUnblockResponse extends AbstractApiResponse {
    AccountBlockUnblockRequest accountBlockUnblockRequest


    @Override
    public String toString() {
        return "AccountBlockUnblockResponse{" +
                "waspId='" + waspId + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", " + accountBlockUnblockRequest.toString() +
                '}';
    }
}