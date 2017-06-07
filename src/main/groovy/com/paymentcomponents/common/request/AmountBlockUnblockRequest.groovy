package com.paymentcomponents.common.request

import com.paymentcomponents.common.request.subobjects.RemittanceInformation

class AmountBlockUnblockRequest {
    String requestId
    Date creationDateTime
    String instructingInstitutionCode
    String instructedInstitutionCode
    int channelCode
    String referenceCode
    String targetAccountFirstName
    String targetAccountLastName
    String targetAccountNumber
    String targetVerificationNumber
    String targetVerificationNumberType
    String targetAccountCategory
    String currency
    Double amount
    String type
    String bankHttpResponseCode
    String bankResponseBody
    RemittanceInformation remittanceInformation

    AmountBlockUnblockRequest() {
    }

    AmountBlockUnblockRequest(String requestId, Date creationDateTime, String instructingInstitutionCode, String instructedInstitutionCode, int channelCode, String referenceCode, String targetAccountFirstName, String targetAccountLastName, String targetAccountNumber, String targetVerificationNumber, String targetVerificationNumberType, String targetAccountCategory, String currency, Double amount, String type, String bankHttpResponseCode, String bankResponseBody, RemittanceInformation remittanceInformation) {
        this.requestId = requestId
        this.creationDateTime = creationDateTime
        this.instructingInstitutionCode = instructingInstitutionCode
        this.instructedInstitutionCode = instructedInstitutionCode
        this.channelCode = channelCode
        this.referenceCode = referenceCode
        this.targetAccountFirstName = targetAccountFirstName
        this.targetAccountLastName = targetAccountLastName
        this.targetAccountNumber = targetAccountNumber
        this.targetVerificationNumber = targetVerificationNumber
        this.targetVerificationNumberType = targetVerificationNumberType
        this.targetAccountCategory = targetAccountCategory
        this.currency = currency
        this.amount = amount
        this.type = type
        this.bankHttpResponseCode = bankHttpResponseCode
        this.bankResponseBody = bankResponseBody
        this.remittanceInformation = remittanceInformation
    }


    @Override
    public String toString() {
        return "AmountBlockUnblockRequest{" +
                "requestId='" + requestId + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", instructingInstitutionCode='" + instructingInstitutionCode + '\'' +
                ", instructedInstitutionCode='" + instructedInstitutionCode + '\'' +
                ", channelCode=" + channelCode +
                ", referenceCode='" + referenceCode + '\'' +
                ", targetAccountFirstName='" + targetAccountFirstName + '\'' +
                ", targetAccountLastName='" + targetAccountLastName + '\'' +
                ", targetAccountNumber='" + targetAccountNumber + '\'' +
                ", targetVerificationNumber='" + targetVerificationNumber + '\'' +
                ", targetVerificationNumberType='" + targetVerificationNumberType + '\'' +
                ", targetAccountCategory='" + targetAccountCategory + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", bankHttpResponseCode='" + bankHttpResponseCode + '\'' +
                ", bankResponseBody='" + bankResponseBody + '\'' +
                ", remittanceInformation=" + remittanceInformation +
                '}';
    }
}