package com.paymentcomponents.common.request

class BalanceEnquiryRequest {
    String requestId
    Date creationDateTime
    String targetAccountNumber
    String instructingInstitutionCode
    String instructedInstitutionCode
    String channelCode

    BalanceEnquiryRequest() {
    }

    BalanceEnquiryRequest(String requestId, Date creationDateTime, String targetAccountNumber, String instructingInstitutionCode, String instructedInstitutionCode, String channelCode) {
        this.requestId = requestId
        this.creationDateTime = creationDateTime
        this.targetAccountNumber = targetAccountNumber
        this.instructingInstitutionCode = instructingInstitutionCode
        this.instructedInstitutionCode = instructedInstitutionCode
        this.channelCode = channelCode
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

    String getTargetAccountNumber() {
        return targetAccountNumber
    }

    void setTargetAccountNumber(String targetAccountNumber) {
        this.targetAccountNumber = targetAccountNumber
    }

    String getInstructingInstitutionCode() {
        return instructingInstitutionCode
    }

    void setInstructingInstitutionCode(String instructingInstitutionCode) {
        this.instructingInstitutionCode = instructingInstitutionCode
    }

    String getInstructedInstitutionCode() {
        return instructedInstitutionCode
    }

    void setInstructedInstitutionCode(String instructedInstitutionCode) {
        this.instructedInstitutionCode = instructedInstitutionCode
    }

    String getChannelCode() {
        return channelCode
    }

    void setChannelCode(String channelCode) {
        this.channelCode = channelCode
    }


    @Override
    public String toString() {
        return "BalanceEnquiryRequest{" +
                "requestId='" + requestId + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", targetAccountNumber='" + targetAccountNumber + '\'' +
                ", instructingInstitutionCode='" + instructingInstitutionCode + '\'' +
                ", instructedInstitutionCode='" + instructedInstitutionCode + '\'' +
                ", channelCode='" + channelCode + '\'' +
                '}';
    }
}