package com.paymentcomponents.common.request.subobjects
/**
 * Created by aodunlami on 18/05/2017.
 */
class PersonalInformation {

    String address
    String mobilePhoneNumber

    PersonalInformation() {
    }

    PersonalInformation(String address, String mobilePhoneNumber) {
        this.address = address
        this.mobilePhoneNumber = mobilePhoneNumber
    }

    String getAddress() {
        return address
    }

    void setAddress(String address) {
        this.address = address
    }

    String getMobilePhoneNumber() {
        return mobilePhoneNumber
    }

    void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber
    }
}
