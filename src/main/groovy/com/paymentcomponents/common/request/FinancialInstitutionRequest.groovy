package com.paymentcomponents.common.request

class FinancialInstitutionRequest {
    String requestId
    Date creationDateTime

    String batchNumber

    FinancialInstitutionRequest() {
    }

    FinancialInstitutionRequest(String requestId, Date creationDateTime, String batchNumber) {
        this.requestId = requestId
        this.creationDateTime = creationDateTime
        this.batchNumber = batchNumber
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

    String getBatchNumber() {
        return batchNumber
    }

    void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber
    }


    @Override
    public String toString() {
        return "FinancialInstitutionRequest{" +
                "requestId='" + requestId + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", batchNumber='" + batchNumber + '\'' +
                '}';
    }
}