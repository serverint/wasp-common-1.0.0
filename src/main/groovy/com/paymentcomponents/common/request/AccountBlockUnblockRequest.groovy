package com.paymentcomponents.common.request

class AccountBlockUnblockRequest {
    String requestId
    Date creationDateTime

    String referenceCode

    String targetAccountName
    String targetBankVerificationNumber
    String targetAccountNumber

    String reasonCode
    String remittanceInformation
    String type


    @Override
    public String toString() {
        return "AccountBlockUnblockRequest{" +
                "requestId='" + requestId + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", referenceCode='" + referenceCode + '\'' +
                ", targetAccountName='" + targetAccountName + '\'' +
                ", targetBankVerificationNumber='" + targetBankVerificationNumber + '\'' +
                ", targetAccountNumber='" + targetAccountNumber + '\'' +
                ", reasonCode='" + reasonCode + '\'' +
                ", remittanceInformation='" + remittanceInformation + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}