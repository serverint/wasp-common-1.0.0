package com.paymentcomponents.common.request

class MandateAdviceRequest {
    String requestId
    Date creationDateTime

    Double amount
    String mandateReference

    String debtorName
    String debtorAccount
    String debtorBankVerificationNumber

    String creditorName
    String creditorAccount
    String creditorBankVerificationNumber

    String debtorKYCLevel
    String creditorKYCLevel

    MandateAdviceRequest() {
    }

    MandateAdviceRequest(String requestId, Date creationDateTime, Double amount, String mandateReference, String debtorName, String debtorAccount, String debtorBankVerificationNumber, String creditorName, String creditorAccount, String creditorBankVerificationNumber, String debtorKYCLevel, String creditorKYCLevel) {
        this.requestId = requestId
        this.creationDateTime = creationDateTime
        this.amount = amount
        this.mandateReference = mandateReference
        this.debtorName = debtorName
        this.debtorAccount = debtorAccount
        this.debtorBankVerificationNumber = debtorBankVerificationNumber
        this.creditorName = creditorName
        this.creditorAccount = creditorAccount
        this.creditorBankVerificationNumber = creditorBankVerificationNumber
        this.debtorKYCLevel = debtorKYCLevel
        this.creditorKYCLevel = creditorKYCLevel
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

    Double getAmount() {
        return amount
    }

    void setAmount(Double amount) {
        this.amount = amount
    }

    String getMandateReference() {
        return mandateReference
    }

    void setMandateReference(String mandateReference) {
        this.mandateReference = mandateReference
    }

    String getDebtorName() {
        return debtorName
    }

    void setDebtorName(String debtorName) {
        this.debtorName = debtorName
    }

    String getDebtorAccount() {
        return debtorAccount
    }

    void setDebtorAccount(String debtorAccount) {
        this.debtorAccount = debtorAccount
    }

    String getDebtorBankVerificationNumber() {
        return debtorBankVerificationNumber
    }

    void setDebtorBankVerificationNumber(String debtorBankVerificationNumber) {
        this.debtorBankVerificationNumber = debtorBankVerificationNumber
    }

    String getCreditorName() {
        return creditorName
    }

    void setCreditorName(String creditorName) {
        this.creditorName = creditorName
    }

    String getCreditorAccount() {
        return creditorAccount
    }

    void setCreditorAccount(String creditorAccount) {
        this.creditorAccount = creditorAccount
    }

    String getCreditorBankVerificationNumber() {
        return creditorBankVerificationNumber
    }

    void setCreditorBankVerificationNumber(String creditorBankVerificationNumber) {
        this.creditorBankVerificationNumber = creditorBankVerificationNumber
    }

    String getDebtorKYCLevel() {
        return debtorKYCLevel
    }

    void setDebtorKYCLevel(String debtorKYCLevel) {
        this.debtorKYCLevel = debtorKYCLevel
    }

    String getCreditorKYCLevel() {
        return creditorKYCLevel
    }

    void setCreditorKYCLevel(String creditorKYCLevel) {
        this.creditorKYCLevel = creditorKYCLevel
    }

    @Override
    public String toString() {
        return "MandateAdviceRequest{" +
                "requestId='" + requestId + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", amount=" + amount +
                ", mandateReference='" + mandateReference + '\'' +
                ", debtorName='" + debtorName + '\'' +
                ", debtorAccount='" + debtorAccount + '\'' +
                ", debtorBankVerificationNumber='" + debtorBankVerificationNumber + '\'' +
                ", creditorName='" + creditorName + '\'' +
                ", creditorAccount='" + creditorAccount + '\'' +
                ", creditorBankVerificationNumber='" + creditorBankVerificationNumber + '\'' +
                ", debtorKYCLevel='" + debtorKYCLevel + '\'' +
                ", creditorKYCLevel='" + creditorKYCLevel + '\'' +
                '}';
    }
}