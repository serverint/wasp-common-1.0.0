package com.paymentcomponents.common.request.subobjects
/**
 * Created by aodunlami on 18/05/2017.
 */
class AccountInformation {

    String accountFirstName
    String accountLastName
    String accountMiddleName
    String accountEntityName
    String accountNumber
    String accountCurrency
    String accountType
    String accountCategory
    String verificationNumber
    String verificationNumberType

    AccountInformation() {
    }

    AccountInformation(String accountFirstName, String accountLastName, String accountMiddleName, String accountEntityName, String accountNumber, String accountCurrency, String accountType, String accountCategory, String verificationNumber, String verificationNumberType) {
        this.accountFirstName = accountFirstName
        this.accountLastName = accountLastName
        this.accountMiddleName = accountMiddleName
        this.accountEntityName = accountEntityName
        this.accountNumber = accountNumber
        this.accountCurrency = accountCurrency
        this.accountType = accountType
        this.accountCategory = accountCategory
        this.verificationNumber = verificationNumber
        this.verificationNumberType = verificationNumberType
    }

    String getAccountType() {
        return accountType
    }

    void setAccountType(String accountType) {
        this.accountType = accountType
    }

    String getAccountFirstName() {
        return accountFirstName
    }

    void setAccountFirstName(String accountFirstName) {
        this.accountFirstName = accountFirstName
    }

    String getAccountLastName() {
        return accountLastName
    }

    void setAccountLastName(String accountLastName) {
        this.accountLastName = accountLastName
    }

    String getAccountMiddleName() {
        return accountMiddleName
    }

    void setAccountMiddleName(String accountMiddleName) {
        this.accountMiddleName = accountMiddleName
    }

    String getAccountEntityName() {
        return accountEntityName
    }

    void setAccountEntityName(String accountEntityName) {
        this.accountEntityName = accountEntityName
    }

    String getAccountNumber() {
        return accountNumber
    }

    void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber
    }

    String getAccountCurrency() {
        return accountCurrency
    }

    void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency
    }

    String getAccountCategory() {
        return accountCategory
    }

    void setAccountCategory(String accountCategory) {
        this.accountCategory = accountCategory
    }

    String getVerificationNumber() {
        return verificationNumber
    }

    void setVerificationNumber(String verificationNumber) {
        this.verificationNumber = verificationNumber
    }

    String getVerificationNumberType() {
        return verificationNumberType
    }

    void setVerificationNumberType(String verificationNumberType) {
        this.verificationNumberType = verificationNumberType
    }

    @Override
    public String toString() {
        return "AccountInformation{" +
                "accountFirstName='" + accountFirstName + '\'' +
                ", accountLastName='" + accountLastName + '\'' +
                ", accountMiddleName='" + accountMiddleName + '\'' +
                ", accountEntityName='" + accountEntityName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountCurrency='" + accountCurrency + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountCategory='" + accountCategory + '\'' +
                ", verificationNumber='" + verificationNumber + '\'' +
                ", verificationNumberType='" + verificationNumberType + '\'' +
                '}';
    }
}