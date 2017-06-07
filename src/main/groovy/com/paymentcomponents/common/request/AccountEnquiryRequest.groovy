package com.paymentcomponents.common.request

class AccountEnquiryRequest {
    String requestId
    Date creationDateTime

    String instructingInstitutionCode
    String instructedInstitutionCode
    int channelCode
    String targetAccountNumber

    AccountEnquiryRequest() {
    }

    AccountEnquiryRequest(String requestId, String instructingInstitutionCode, String instructedInstitutionCode, int channelCode, String targetAccountNumber) {
        this.requestId = requestId
        this.instructingInstitutionCode = instructingInstitutionCode
        this.instructedInstitutionCode = instructedInstitutionCode
        this.channelCode = channelCode
        this.targetAccountNumber = targetAccountNumber
    }

    String getTargetAccountNumber() {
        return targetAccountNumber
    }

    void setTargetAccountNumber(String targetAccountNumber) {
        this.targetAccountNumber = targetAccountNumber
    }

    String getRequestId() {
        return requestId
    }

    Date getCreationDateTime() {
        return creationDateTime
    }

    void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime
    }

    void setRequestId(String requestId) {
        this.requestId = requestId
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

    int getChannelCode() {
        return channelCode
    }

    void setChannelCode(int channelCode) {
        this.channelCode = channelCode
    }


    @Override
    public String toString() {
        return "AccountEnquiryRequest{" +
                "requestId='" + requestId + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", instructingInstitutionCode='" + instructingInstitutionCode + '\'' +
                ", instructedInstitutionCode='" + instructedInstitutionCode + '\'' +
                ", channelCode=" + channelCode +
                ", targetAccountNumber='" + targetAccountNumber + '\'' +
                '}';
    }
}