package com.paymentcomponents.common.models

/**
 * Created by aalexandrakis on 19/03/2017.
 */
/**
 * Created by aalexandrakis on 23/02/2017.
 */
public class IdentityToken {
    private String id
    private UUID userId
    private String userEmail
    private String token
    private Long createdAt
    private Long expiresIn
    private String referrer
    private String userAgent
    private String permissions
    private String referrerIp

    IdentityToken() {
    }

    IdentityToken(UUID userId, String token, Long createdAt, Long expiresIn) {
        this.userId = userId
        this.token = token
        this.createdAt = createdAt
        this.expiresIn = expiresIn
    }

    IdentityToken(String id, UUID userId, String userEmail, String token, Long createdAt, Long expiresIn, String referrer, String userAgent, String permissions, String referrerIp) {
        this.id = id
        this.userId = userId
        this.userEmail = userEmail
        this.token = token
        this.createdAt = createdAt
        this.expiresIn = expiresIn
        this.referrer = referrer
        this.userAgent = userAgent
        this.permissions = permissions
        this.referrerIp = referrerIp
    }

    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    String getUserEmail() {
        return userEmail
    }

    void setUserEmail(String userEmail) {
        this.userEmail = userEmail
    }

    String getPermissions() {
        return permissions
    }

    void setPermissions(String permissions) {
        this.permissions = permissions
    }

    UUID getUserId() {
        return userId
    }

    void setUserId(UUID userId) {
        this.userId = userId
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

    String getReferrerIp() {
        return referrerIp
    }

    void setReferrerIp(String referrerIp) {
        this.referrerIp = referrerIp
    }

    String getUserAgent() {
        return userAgent
    }

    void setUserAgent(String userAgent) {
        this.userAgent = userAgent
    }

    @Override
    public String toString() {
        return "IdentityToken{" +
                "id='" + id + '\'' +
                ", userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", token='" + token + '\'' +
                ", createdAt=" + createdAt +
                ", expiresIn=" + expiresIn +
                ", referrer='" + referrer + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", permissions='" + permissions + '\'' +
                ", referrerIp='" + referrerIp + '\'' +
                '}';
    }
}

