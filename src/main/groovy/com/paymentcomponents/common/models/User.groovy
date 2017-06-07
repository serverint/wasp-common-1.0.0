package com.paymentcomponents.common.models
/**
 * Created by aalexandrakis on 23/02/2017.
 */
public class User {
    private UUID userId
    private String userEmail
    private String password
    private String userName
    private String role
    private Date confirmedOn
    private String confirmationToken
    private String resetPasswordToken
    private boolean active
    private Integer loginAttempts
    private Long financialInstitutionId
    private Bank bank
    
    User() {
    }

    User(UUID userId, String userEmail, String password, String userName, String role, Date confirmedOn, String confirmationToken, String resetPasswordToken, boolean active, Integer loginAttempts, Long financialInstitutionId, Bank bank) {
        this.userId = userId
        this.userEmail = userEmail
        this.password = password
        this.userName = userName
        this.role = role
        this.confirmedOn = confirmedOn
        this.confirmationToken = confirmationToken
        this.resetPasswordToken = resetPasswordToken
        this.active = active
        this.loginAttempts = loginAttempts
        this.financialInstitutionId = financialInstitutionId
        this.bank = bank
    }

    UUID getUserId() {
        return userId
    }

    void setUserId(UUID userId) {
        this.userId = userId
    }

    String getUserEmail() {
        return userEmail
    }

    void setUserEmail(String userEmail) {
        this.userEmail = userEmail
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }

    String getUserName() {
        return userName
    }

    void setUserName(String userName) {
        this.userName = userName
    }

    String getRole() {
        return role
    }

    void setRole(String role) {
        this.role = role
    }

    Date getConfirmedOn() {
        return confirmedOn
    }

    void setConfirmedOn(Date confirmedOn) {
        this.confirmedOn = confirmedOn
    }

    String getConfirmationToken() {
        return confirmationToken
    }

    void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken
    }

    String getResetPasswordToken() {
        return resetPasswordToken
    }

    void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken
    }

    boolean getActive() {
        return active
    }

    void setActive(boolean active) {
        this.active = active
    }

    Integer getLoginAttempts() {
        return loginAttempts
    }

    void setLoginAttempts(Integer loginAttempts) {
        this.loginAttempts = loginAttempts
    }

    Long getFinancialInstitutionId() {
        return financialInstitutionId
    }

    void setFinancialInstitutionId(Long financialInstitutionId) {
        this.financialInstitutionId = financialInstitutionId
    }

    Bank getBank() {
        return bank
    }

    void setBank(Bank bank) {
        this.bank = bank
    }


    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                ", confirmedOn=" + confirmedOn +
                ", confirmationToken='" + confirmationToken + '\'' +
                ", resetPasswordToken='" + resetPasswordToken + '\'' +
                ", active=" + active +
                ", loginAttempts=" + loginAttempts +
                ", financialInstitutionId=" + financialInstitutionId +
                ", bank=" + bank +
                '}';
    }
}
