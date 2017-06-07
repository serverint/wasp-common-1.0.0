package com.paymentcomponents.common.response

import com.paymentcomponents.common.request.subobjects.CreditorInformation
import com.paymentcomponents.common.request.subobjects.DebtorInformation
import com.paymentcomponents.common.request.subobjects.RemittanceInformation
import com.paymentcomponents.common.request.subobjects.TransactionLocationInformation

/**
 * Created by John on 25/5/2017.
 */
class CreditTransferResponse {
    String responseCode

    String requestId
    Date creationDateTime
    String instructingInstitutionCode
    String instructedInstitutionCode
    String instructingInstitutionBic
    String instructedInstitutionBic
    int channelCode
    String transactionId
    String endToEndId
    Date valueDate
    String currency
    Double amount
    String chargeBearer
    Double chargesAmount
    Double instructedAmount
    String accountEnquiryReference
    String transactionRiskValue
    String bankHttpResponseCode
    String bankResponseBody
    TransactionLocationInformation transactionLocationInformation
    DebtorInformation debtorInformation
    CreditorInformation creditorInformation
    RemittanceInformation remittanceInformation

    CreditTransferResponse() {
    }

    CreditTransferResponse(String responseCode, String requestId, Date creationDateTime, String instructingInstitutionCode, String instructedInstitutionCode, String instructingInstitutionBic, String instructedInstitutionBic, int channelCode, String transactionId, String endToEndId, Date valueDate, String currency, Double amount, String chargeBearer, Double chargesAmount, Double instructedAmount, String accountEnquiryReference, String transactionRiskValue, String bankHttpResponseCode, String bankResponseBody, TransactionLocationInformation transactionLocationInformation, DebtorInformation debtorInformation, CreditorInformation creditorInformation, RemittanceInformation remittanceInformation) {
        this.responseCode = responseCode
        this.requestId = requestId
        this.creationDateTime = creationDateTime
        this.instructingInstitutionCode = instructingInstitutionCode
        this.instructedInstitutionCode = instructedInstitutionCode
        this.instructingInstitutionBic = instructingInstitutionBic
        this.instructedInstitutionBic = instructedInstitutionBic
        this.channelCode = channelCode
        this.transactionId = transactionId
        this.endToEndId = endToEndId
        this.valueDate = valueDate
        this.currency = currency
        this.amount = amount
        this.chargeBearer = chargeBearer
        this.chargesAmount = chargesAmount
        this.instructedAmount = instructedAmount
        this.accountEnquiryReference = accountEnquiryReference
        this.transactionRiskValue = transactionRiskValue
        this.bankHttpResponseCode = bankHttpResponseCode
        this.bankResponseBody = bankResponseBody
        this.transactionLocationInformation = transactionLocationInformation
        this.debtorInformation = debtorInformation
        this.creditorInformation = creditorInformation
        this.remittanceInformation = remittanceInformation
    }

    String getResponseCode() {
        return responseCode
    }

    void setResponseCode(String responseCode) {
        this.responseCode = responseCode
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

    String getInstructingInstitutionBic() {
        return instructingInstitutionBic
    }

    void setInstructingInstitutionBic(String instructingInstitutionBic) {
        this.instructingInstitutionBic = instructingInstitutionBic
    }

    String getInstructedInstitutionBic() {
        return instructedInstitutionBic
    }

    void setInstructedInstitutionBic(String instructedInstitutionBic) {
        this.instructedInstitutionBic = instructedInstitutionBic
    }

    int getChannelCode() {
        return channelCode
    }

    void setChannelCode(int channelCode) {
        this.channelCode = channelCode
    }

    String getTransactionId() {
        return transactionId
    }

    void setTransactionId(String transactionId) {
        this.transactionId = transactionId
    }

    String getEndToEndId() {
        return endToEndId
    }

    void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId
    }

    Date getValueDate() {
        return valueDate
    }

    void setValueDate(Date valueDate) {
        this.valueDate = valueDate
    }

    String getCurrency() {
        return currency
    }

    void setCurrency(String currency) {
        this.currency = currency
    }

    Double getAmount() {
        return amount
    }

    void setAmount(Double amount) {
        this.amount = amount
    }

    String getChargeBearer() {
        return chargeBearer
    }

    void setChargeBearer(String chargeBearer) {
        this.chargeBearer = chargeBearer
    }

    Double getChargesAmount() {
        return chargesAmount
    }

    void setChargesAmount(Double chargesAmount) {
        this.chargesAmount = chargesAmount
    }

    Double getInstructedAmount() {
        return instructedAmount
    }

    void setInstructedAmount(Double instructedAmount) {
        this.instructedAmount = instructedAmount
    }

    String getAccountEnquiryReference() {
        return accountEnquiryReference
    }

    void setAccountEnquiryReference(String accountEnquiryReference) {
        this.accountEnquiryReference = accountEnquiryReference
    }

    String getTransactionRiskValue() {
        return transactionRiskValue
    }

    void setTransactionRiskValue(String transactionRiskValue) {
        this.transactionRiskValue = transactionRiskValue
    }

    String getBankHttpResponseCode() {
        return bankHttpResponseCode
    }

    void setBankHttpResponseCode(String bankHttpResponseCode) {
        this.bankHttpResponseCode = bankHttpResponseCode
    }

    String getBankResponseBody() {
        return bankResponseBody
    }

    void setBankResponseBody(String bankResponseBody) {
        this.bankResponseBody = bankResponseBody
    }

    TransactionLocationInformation getTransactionLocationInformation() {
        return transactionLocationInformation
    }

    void setTransactionLocationInformation(TransactionLocationInformation transactionLocationInformation) {
        this.transactionLocationInformation = transactionLocationInformation
    }

    DebtorInformation getDebtorInformation() {
        return debtorInformation
    }

    void setDebtorInformation(DebtorInformation debtorInformation) {
        this.debtorInformation = debtorInformation
    }

    CreditorInformation getCreditorInformation() {
        return creditorInformation
    }

    void setCreditorInformation(CreditorInformation creditorInformation) {
        this.creditorInformation = creditorInformation
    }

    RemittanceInformation getRemittanceInformation() {
        return remittanceInformation
    }

    void setRemittanceInformation(RemittanceInformation remittanceInformation) {
        this.remittanceInformation = remittanceInformation
    }


    @Override
    public String toString() {
        return "CreditTransferResponse{" +
                "responseCode='" + responseCode + '\'' +
                ", requestId='" + requestId + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", instructingInstitutionCode='" + instructingInstitutionCode + '\'' +
                ", instructedInstitutionCode='" + instructedInstitutionCode + '\'' +
                ", instructingInstitutionBic='" + instructingInstitutionBic + '\'' +
                ", instructedInstitutionBic='" + instructedInstitutionBic + '\'' +
                ", channelCode=" + channelCode +
                ", transactionId='" + transactionId + '\'' +
                ", endToEndId='" + endToEndId + '\'' +
                ", valueDate=" + valueDate +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", chargeBearer='" + chargeBearer + '\'' +
                ", chargesAmount=" + chargesAmount +
                ", instructedAmount=" + instructedAmount +
                ", accountEnquiryReference='" + accountEnquiryReference + '\'' +
                ", transactionRiskValue='" + transactionRiskValue + '\'' +
                ", bankHttpResponseCode='" + bankHttpResponseCode + '\'' +
                ", bankResponseBody='" + bankResponseBody + '\'' +
                ", transactionLocationInformation=" + transactionLocationInformation +
                ", debtorInformation=" + debtorInformation +
                ", creditorInformation=" + creditorInformation +
                ", remittanceInformation=" + remittanceInformation +
                '}';
    }
}
