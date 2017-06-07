package com.paymentcomponents.common.response

import com.paymentcomponents.common.request.AmountBlockUnblockRequest

class AmountBlockUnblockResponse extends AbstractApiResponse {
    AmountBlockUnblockRequest amountBlockUnblockRequest


    @Override
    public String toString() {
        return "AmountBlockUnblockResponse{" +
                "waspId='" + waspId + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", " + amountBlockUnblockRequest.toString() +
                '}';
    }
}