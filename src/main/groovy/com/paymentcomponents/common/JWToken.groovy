package com.paymentcomponents.common

/**
 * Created by aalexandrakis on 31/03/2017.
 */
class JWToken {
    private JWTokenHeader jwTokenHeader
    private JWTokenPayload jwTokenPayload

    JWToken(JWTokenHeader jwTokenHeader, JWTokenPayload jwTokenPayload) {
        this.jwTokenHeader = jwTokenHeader
        this.jwTokenPayload = jwTokenPayload
    }

    JWToken() {
    }

    JWTokenHeader getJwTokenHeader() {
        return jwTokenHeader
    }

    void setJwTokenHeader(JWTokenHeader jwTokenHeader) {
        this.jwTokenHeader = jwTokenHeader
    }

    JWTokenPayload getJwTokenPayload() {
        return jwTokenPayload
    }

    void setJwTokenPayload(JWTokenPayload jwTokenPayload) {
        this.jwTokenPayload = jwTokenPayload
    }
}

class JWTokenHeader {
    private String algorithm
    private String tokenType

    JWTokenHeader(String algorithm, String tokenType) {
        this.algorithm = algorithm
        this.tokenType = tokenType
    }

    JWTokenHeader() {
    }

    String getAlgorithm() {
        return algorithm
    }

    void setAlgorithm(String algorithm) {
        this.algorithm = algorithm
    }

    String getTokenType() {
        return tokenType
    }

    void setTokenType(String tokenType) {
        this.tokenType = tokenType
    }


    @Override
    public String toString() {
        return "JWTokenHeader{" +
                "algorithm='" + algorithm + '\'' +
                ", tokenType='" + tokenType + '\'' +
                '}';
    }
}


class JWTokenPayload {

    private String issuer
    private String subject
    private String referrer
    private String referrerIp
    private String userAgent
    private Long expiresIn
    private Long notUseBefore
    private Long issuedAt
    private String jwtId
    private String userEmail
    private String userName
    private List<String> permissions
    private String csrfToken


    JWTokenPayload() {
    }

    JWTokenPayload(String issuer, String subject, String referrer, String referrerIp, String userAgent, Long expiresIn, Long notUseBefore, Long issuedAt, String jwtId, String userEmail, String userName, List<String> permissions, String csrfToken) {
        this.issuer = issuer
        this.subject = subject
        this.referrer = referrer
        this.referrerIp = referrerIp
        this.userAgent = userAgent
        this.expiresIn = expiresIn
        this.notUseBefore = notUseBefore
        this.issuedAt = issuedAt
        this.jwtId = jwtId
        this.userEmail = userEmail
        this.userName = userName
        this.permissions = permissions
        this.csrfToken = csrfToken
    }

    String getIssuer() {
        return issuer
    }

    void setIssuer(String issuer) {
        this.issuer = issuer
    }

    String getSubject() {
        return subject
    }

    void setSubject(String subject) {
        this.subject = subject
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

    Long getExpiresIn() {
        return expiresIn
    }

    void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn
    }

    Long getNotUseBefore() {
        return notUseBefore
    }

    void setNotUseBefore(Long notUseBefore) {
        this.notUseBefore = notUseBefore
    }

    Long getIssuedAt() {
        return issuedAt
    }

    void setIssuedAt(Long issuedAt) {
        this.issuedAt = issuedAt
    }

    String getJwtId() {
        return jwtId
    }

    void setJwtId(String jwtId) {
        this.jwtId = jwtId
    }

    String getUserEmail() {
        return userEmail
    }

    void setUserEmail(String userEmail) {
        this.userEmail = userEmail
    }

    List<String> getPermissions() {
        return permissions
    }

    void setPermissions(List<String> permissions) {
        this.permissions = permissions
    }

    String getCsrfToken() {
        return csrfToken
    }

    void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken
    }

    String getUserName() {
        return userName
    }

    void setUserName(String userName) {
        this.userName = userName
    }

    @Override
    public String toString() {
        return "JWTokenPayload{" +
                "issuer='" + issuer + '\'' +
                ", subject='" + subject + '\'' +
                ", referrer='" + referrer + '\'' +
                ", referrerIp='" + referrerIp + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", expiresIn=" + expiresIn +
                ", notUseBefore=" + notUseBefore +
                ", issuedAt=" + issuedAt +
                ", jwtId='" + jwtId + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userName='" + userName + '\'' +
                ", permissions=" + permissions +
                ", csrfToken='" + csrfToken + '\'' +
                '}';
    }
}
