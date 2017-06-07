package com.paymentcomponents.common.models

import com.fasterxml.jackson.annotation.JsonIgnore

/**
 * Created by aalexandrakis on 19/03/2017.
 */
/**
 * Created by aalexandrakis on 23/02/2017.
 */
public class ApiIdentityToken {
    private String id
    private UUID userId
    private Long apiKeyId
    private Long financialInstitutionId
    @JsonIgnore
    private String token
    private Long createdAt
    private Long expiresIn
    private String referrer
    private String userAgent
    private String referrerIp

    ApiIdentityToken() {
    }

    ApiIdentityToken(String id, UUID userId, Long apiKeyId, Long financialInstitutionId, String token, Long createdAt, Long expiresIn, String referrer, String userAgent, String referrerIp) {
        this.id = id
        this.userId = userId
        this.apiKeyId = apiKeyId
        this.financialInstitutionId = financialInstitutionId
        this.token = token
        this.createdAt = createdAt
        this.expiresIn = expiresIn
        this.referrer = referrer
        this.userAgent = userAgent
        this.referrerIp = referrerIp
    }

    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    UUID getUserId() {
        return userId
    }

    void setUserId(UUID userId) {
        this.userId = userId
    }

    Long getApiKeyId() {
        return apiKeyId
    }

    void setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId
    }

    Long getFinancialInstitutionId() {
        return financialInstitutionId
    }

    void setFinancialInstitutionId(Long financialInstitutionId) {
        this.financialInstitutionId = financialInstitutionId
    }

    String getToken() {
        return token
    }

    void setToken(String token) {
        this.token = token
    }

    Long getCreatedAt() {
        return createdAt
    }

    void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt
    }

    Long getExpiresIn() {
        return expiresIn
    }

    void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn
    }

    String getReferrer() {
        return referrer
    }

    void setReferrer(String referrer) {
        this.referrer = referrer
    }

    String getUserAgent() {
        return userAgent
    }

    void setUserAgent(String userAgent) {
        this.userAgent = userAgent
    }

    String getReferrerIp() {
        return referrerIp
    }

    void setReferrerIp(String referrerIp) {
        this.referrerIp = referrerIp
    }


    @Override
    public String toString() {
        return "ApiIdentityToken{" +
                "id='" + id + '\'' +
                ", userId=" + userId +
                ", apiKeyId=" + apiKeyId +
                ", financialInstitutionId=" + financialInstitutionId +
                ", token='" + token + '\'' +
                ", createdAt=" + createdAt +
                ", expiresIn=" + expiresIn +
                ", referrer='" + referrer + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", referrerIp='" + referrerIp + '\'' +
                '}';
    }
}

