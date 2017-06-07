package com.paymentcomponents.common.request.subobjects
/**
 * Created by aalexandrakis on 17/05/2017.
 */
class CreditorInformation {
    String creditorFirstName
    String creditorLastName
    String creditorMiddleName
    String creditorCompanyName
    String creditorAccount
    String creditorAccountCategory
    String creditorVerificationNumber
    String creditorVerificationNumberType

    CreditorInformation() {
    }

    CreditorInformation(String creditorFirstName, String creditorLastName, String creditorMiddleName, String creditorCompanyName, String creditorAccount, String creditorAccountCategory, String creditorVerificationNumber, String creditorVerificationNumberType) {
        this.creditorFirstName = creditorFirstName
        this.creditorLastName = creditorLastName
        this.creditorMiddleName = creditorMiddleName
        this.creditorCompanyName = creditorCompanyName
        this.creditorAccount = creditorAccount
        this.creditorAccountCategory = creditorAccountCategory
        this.creditorVerificationNumber = creditorVerificationNumber
        this.creditorVerificationNumberType = creditorVerificationNumberType
    }

    String getCreditorFirstName() {
        return creditorFirstName
    }

    void setCreditorFirstName(String creditorFirstName) {
        this.creditorFirstName = creditorFirstName
    }

    String getCreditorLastName() {
        return creditorLastName
    }

    void setCreditorLastName(String creditorLastName) {
        this.creditorLastName = creditorLastName
    }

    String getCreditorMiddleName() {
        return creditorMiddleName
    }

    void setCreditorMiddleName(String creditorMiddleName) {
        this.creditorMiddleName = creditorMiddleName
    }

    String getCreditorCompanyName() {
        return creditorCompanyName
    }

    void setCreditorCompanyName(String creditorCompanyName) {
        this.creditorCompanyName = creditorCompanyName
    }

    String getCreditorAccount() {
        return creditorAccount
    }

    void setCreditorAccount(String creditorAccount) {
        this.creditorAccount = creditorAccount
    }

    String getCreditorAccountCategory() {
        return creditorAccountCategory
    }

    void setCreditorAccountCategory(String creditorAccountCategory) {
        this.creditorAccountCategory = creditorAccountCategory
    }

    String getCreditorVerificationNumber() {
        return creditorVerificationNumber
    }

    void setCreditorVerificationNumber(String creditorVerificationNumber) {
        this.creditorVerificationNumber = creditorVerificationNumber
    }

    String getCreditorVerificationNumberType() {
        return creditorVerificationNumberType
    }

    void setCreditorVerificationNumberType(String creditorVerificationNumberType) {
        this.creditorVerificationNumberType = creditorVerificationNumberType
    }


    @Override
    public String toString() {
        return "CreditorInformation{" +
                "creditorFirstName='" + creditorFirstName + '\'' +
                ", creditorLastName='" + creditorLastName + '\'' +
                ", creditorMiddleName='" + creditorMiddleName + '\'' +
                ", creditorCompanyName='" + creditorCompanyName + '\'' +
                ", creditorAccount='" + creditorAccount + '\'' +
                ", creditorAccountCategory='" + creditorAccountCategory + '\'' +
                ", creditorVerificationNumber='" + creditorVerificationNumber + '\'' +
                ", creditorVerificationNumberType='" + creditorVerificationNumberType + '\'' +
                '}';
    }
}
