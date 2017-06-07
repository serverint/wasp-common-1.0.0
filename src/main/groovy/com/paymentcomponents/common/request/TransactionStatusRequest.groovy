package com.paymentcomponents.common.request


class TransactionStatusRequest {
    String requestId
    Date creationDateTime
    String transactionsRequestId

    TransactionStatusRequest(String requestId, Date creationDateTime, String transactionsRequestId) {
        this.requestId = requestId
        this.creationDateTime = creationDateTime
        this.transactionsRequestId = transactionsRequestId
    }

    TransactionStatusRequest() {
    }

    String getRequestId() {
        return requestId
    }

    void setRequestId(String requestId) {
        this.requestId = requestId
    }

    Date getCreationDateTime() {
        return creationDateTime
    }

    void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime
    }

    String getTransactionsRequestId() {
        return transactionsRequestId
    }

    void setTransactionsRequestId(String transactionsRequestId) {
        this.transactionsRequestId = transactionsRequestId
    }


    @Override
    public String toString() {
        return "TransactionStatusRequest{" +
                "requestId='" + requestId + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", transactionsRequestId='" + transactionsRequestId + '\'' +
                '}';
    }
}



