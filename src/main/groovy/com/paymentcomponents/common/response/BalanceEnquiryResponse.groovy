package com.paymentcomponents.common.response

import com.paymentcomponents.common.request.BalanceEnquiryRequest

class BalanceEnquiryResponse extends BalanceEnquiryRequest {
    String responseCode

    Double availableBalance
    String accountCurrency
    String accountPosition
    String accountStatus

    BalanceEnquiryResponse() {
    }

    BalanceEnquiryResponse(String responseCode, Double availableBalance, String accountCurrency, String accountPosition, String accountStatus) {
        this.responseCode = responseCode
        this.availableBalance = availableBalance
        this.accountCurrency = accountCurrency
        this.accountPosition = accountPosition
        this.accountStatus = accountStatus
    }

    String getResponseCode() {
        return responseCode
    }

    void setResponseCode(String responseCode) {
        this.responseCode = responseCode
    }

    Double getAvailableBalance() {
        return availableBalance
    }

    void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance
    }

    String getAccountCurrency() {
        return accountCurrency
    }

    void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency
    }

    String getAccountPosition() {
        return accountPosition
    }

    void setAccountPosition(String accountPosition) {
        this.accountPosition = accountPosition
    }

    String getAccountStatus() {
        return accountStatus
    }

    void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus
    }

    @Override
    public String toString() {
        return "BalanceEnquiryResponse{" +
                "responseCode='" + responseCode + '\'' +
                ", requestId='" + requestId + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", availableBalance=" + availableBalance +
                ", accountCurrency='" + accountCurrency + '\'' +
                ", accountPosition='" + accountPosition + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }
}