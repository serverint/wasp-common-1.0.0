package com.paymentcomponents.common.request.subobjects
/**
 * Created by aalexandrakis on 17/05/2017.
 */
class RemittanceInformation {
    String additionalComments
    String categoryPurpose
    Salary salary
    PaymentInformation paymentInformation

    RemittanceInformation() {
    }

    RemittanceInformation(String additionalComments, String categoryPurpose, Salary salary, PaymentInformation paymentInformation) {
        this.additionalComments = additionalComments
        this.categoryPurpose = categoryPurpose
        this.salary = salary
        this.paymentInformation = paymentInformation
    }

    String getAdditionalComments() {
        return additionalComments
    }

    void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments
    }

    String getCategoryPurpose() {
        return categoryPurpose
    }

    void setCategoryPurpose(String categoryPurpose) {
        this.categoryPurpose = categoryPurpose
    }

    Salary getSalary() {
        return salary
    }

    void setSalary(Salary salary) {
        this.salary = salary
    }

    PaymentInformation getPaymentInformation() {
        return paymentInformation
    }

    void setPaymentInformation(PaymentInformation paymentInformation) {
        this.paymentInformation = paymentInformation
    }


    @Override
    public String toString() {
        return "RemittanceInformation{" +
                "additionalComments='" + additionalComments + '\'' +
                ", categoryPurpose='" + categoryPurpose + '\'' +
                ", salary=" + salary.toString() +
                ", paymentInformation=" + paymentInformation.toString() +
                '}';
    }
}
