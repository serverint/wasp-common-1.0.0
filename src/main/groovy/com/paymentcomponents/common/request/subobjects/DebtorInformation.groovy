package com.paymentcomponents.common.request.subobjects
/**
 * Created by aalexandrakis on 17/05/2017.
 */
class DebtorInformation {
    String debtorFirstName
    String debtorLastName
    String debtorMiddleName
    String debtorCompanyName
    String debtorAccount
    String debtorAccountCategory
    String debtorVerificationNumber
    String debtorVerificationNumberType

    DebtorInformation() {
    }

    DebtorInformation(String debtorFirstName, String debtorLastName, String debtorMiddleName, String debtorCompanyName, String debtorAccount, String debtorAccountCategory, String debtorVerificationNumber, String debtorVerificationNumberType) {
        this.debtorFirstName = debtorFirstName
        this.debtorLastName = debtorLastName
        this.debtorMiddleName = debtorMiddleName
        this.debtorCompanyName = debtorCompanyName
        this.debtorAccount = debtorAccount
        this.debtorAccountCategory = debtorAccountCategory
        this.debtorVerificationNumber = debtorVerificationNumber
        this.debtorVerificationNumberType = debtorVerificationNumberType
    }

    String getDebtorFirstName() {
        return debtorFirstName
    }

    void setDebtorFirstName(String debtorFirstName) {
        this.debtorFirstName = debtorFirstName
    }

    String getDebtorLastName() {
        return debtorLastName
    }

    void setDebtorLastName(String debtorLastName) {
        this.debtorLastName = debtorLastName
    }

    String getDebtorMiddleName() {
        return debtorMiddleName
    }

    void setDebtorMiddleName(String debtorMiddleName) {
        this.debtorMiddleName = debtorMiddleName
    }

    String getDebtorCompanyName() {
        return debtorCompanyName
    }

    void setDebtorCompanyName(String debtorCompanyName) {
        this.debtorCompanyName = debtorCompanyName
    }

    String getDebtorAccount() {
        return debtorAccount
    }

    void setDebtorAccount(String debtorAccount) {
        this.debtorAccount = debtorAccount
    }

    String getDebtorAccountCategory() {
        return debtorAccountCategory
    }

    void setDebtorAccountCategory(String debtorAccountCategory) {
        this.debtorAccountCategory = debtorAccountCategory
    }

    String getDebtorVerificationNumber() {
        return debtorVerificationNumber
    }

    void setDebtorVerificationNumber(String debtorVerificationNumber) {
        this.debtorVerificationNumber = debtorVerificationNumber
    }

    String getDebtorVerificationNumberType() {
        return debtorVerificationNumberType
    }

    void setDebtorVerificationNumberType(String debtorVerificationNumberType) {
        this.debtorVerificationNumberType = debtorVerificationNumberType
    }


    @Override
    public String toString() {
        return "DebtorInformation{" +
                "debtorFirstName='" + debtorFirstName + '\'' +
                ", debtorLastName='" + debtorLastName + '\'' +
                ", debtorMiddleName='" + debtorMiddleName + '\'' +
                ", debtorCompanyName='" + debtorCompanyName + '\'' +
                ", debtorAccount='" + debtorAccount + '\'' +
                ", debtorAccountCategory='" + debtorAccountCategory + '\'' +
                ", debtorVerificationNumber='" + debtorVerificationNumber + '\'' +
                ", debtorVerificationNumberType='" + debtorVerificationNumberType + '\'' +
                '}';
    }
}
