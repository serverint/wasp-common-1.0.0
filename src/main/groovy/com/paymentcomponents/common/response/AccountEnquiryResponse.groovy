package com.paymentcomponents.common.response

import com.paymentcomponents.common.request.subobjects.AccountInformation
import com.paymentcomponents.common.request.subobjects.PersonalInformation

/**
 * Created by a.polichronopoulos on 20-04-2017.
 */
class AccountEnquiryResponse {
    AccountInformation accountInformation
    PersonalInformation personalInformation
    String accountStatus

    AccountEnquiryResponse() {
    }

    AccountEnquiryResponse(AccountInformation accountInformation, PersonalInformation personalInformation, String accountStatus) {
        this.accountInformation = accountInformation
        this.personalInformation = personalInformation
        this.accountStatus = accountStatus
    }

    AccountInformation getAccountInformation() {
        return accountInformation
    }

    void setAccountInformation(AccountInformation accountInformation) {
        this.accountInformation = accountInformation
    }

    PersonalInformation getPersonalInformation() {
        return personalInformation
    }

    void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation
    }

    String getAccountStatus() {
        return accountStatus
    }

    void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus
    }

    @Override
    public String toString() {
        return "AccountEnquiryResponse{" +
                "accountInformation=" + accountInformation +
                ", personalInformation=" + personalInformation +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }
}