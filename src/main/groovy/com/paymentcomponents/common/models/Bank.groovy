package com.paymentcomponents.common.models;

/**
 * Created by aalexandrakis on 19/03/2017.
 */
public class Bank {

    private Long financialInstitutionId
    private String bic
    private String bankName
    private boolean connectedToWasp = false
    private String city
    private String branch
    private String waspConnectUrl
    private boolean primaryBank
    private String centralBankCode
    private String directBank

    Bank() {
    }

    Bank(Long financialInstitutionId, String bic, String bankName, boolean connectedToWasp, String city, String branch, String waspConnectUrl,  boolean primaryBank, String centralBankCode, String directBank) {
        this.financialInstitutionId = financialInstitutionId
        this.bic = bic
        this.bankName = bankName
        this.connectedToWasp = connectedToWasp
        this.city = city
        this.branch = branch
        this.waspConnectUrl = waspConnectUrl
        this.primaryBank = primaryBank
        this.centralBankCode = centralBankCode
        this.directBank = directBank
    }

    Long getFinancialInstitutionId() {
        return financialInstitutionId
    }

    void setFinancialInstitutionId(Long financialInstitutionId) {
        this.financialInstitutionId = financialInstitutionId
    }

    String getBic() {
        return bic
    }

    void setBic(String bic) {
        this.bic = bic
    }

    String getBankName() {
        return bankName
    }

    void setBankName(String bankName) {
        this.bankName = bankName
    }

    boolean getConnectedToWasp() {
        return connectedToWasp
    }

    void setConnectedToWasp(boolean connectedToWasp) {
        this.connectedToWasp = connectedToWasp
    }

    String getCity() {
        return city
    }

    void setCity(String city) {
        this.city = city
    }

    String getBranch() {
        return branch
    }

    void setBranch(String branch) {
        this.branch = branch
    }

    String getWaspConnectUrl() {
        return waspConnectUrl
    }

    void setWaspConnectUrl(String waspConnectUrl) {
        this.waspConnectUrl = waspConnectUrl
    }

    boolean getPrimaryBank() {
        return primaryBank
    }

    void setPrimaryBank(boolean primaryBank) {
        this.primaryBank = primaryBank
    }

    String getCentralBankCode() {
        return centralBankCode
    }

    void setCentralBankCode(String centralBankCode) {
        this.centralBankCode = centralBankCode
    }

    String getDirectBank() {
        return directBank
    }

    void setDirectBank(String directBank) {
        this.directBank = directBank
    }

    @Override
    public String toString() {
        return "Bank{" +
                "financialInstitutionId=" + financialInstitutionId +
                ", bic='" + bic + '\'' +
                ", bankName='" + bankName + '\'' +
                ", connectedToWasp=" + connectedToWasp +
                ", city='" + city + '\'' +
                ", branch='" + branch + '\'' +
                ", waspConnectUrl='" + waspConnectUrl + '\'' +
                ", primaryBank=" + primaryBank +
                ", centralBankCode='" + centralBankCode + '\'' +
                ", directBank='" + directBank + '\'' +
                '}';
    }
}
