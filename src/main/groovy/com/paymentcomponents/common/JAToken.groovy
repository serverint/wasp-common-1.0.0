package com.paymentcomponents.common

/**
 * Created by aalexandrakis on 31/03/2017.
 * JAT means Json Api Token. It's a custom terminology to not conflict with the JsonWebTokens
 * we are using for Web Application. Actually are both Json Web Tokens
 */
class JAToken {
    private JATokenHeader jaTokenHeader
    private JATokenPayload jaTokenPayload

    JAToken(JATokenHeader jaTokenHeader, JATokenPayload jaTokenPayload) {
        this.jaTokenHeader = jaTokenHeader
        this.jaTokenPayload = jaTokenPayload
    }

    JAToken() {
    }

    JATokenHeader getJaTokenHeader() {
        return jaTokenHeader
    }

    void setJaTokenHeader(JATokenHeader jaTokenHeader) {
        this.jaTokenHeader = jaTokenHeader
    }

    JATokenPayload getJaTokenPayload() {
        return jaTokenPayload
    }

    void setJaTokenPayload(JATokenPayload jaTokenPayload) {
        this.jaTokenPayload = jaTokenPayload
    }
}

class JATokenHeader {
    private String algorithm
    private String tokenType

    JATokenHeader(String algorithm, String tokenType) {
        this.algorithm = algorithm
        this.tokenType = tokenType
    }

    JATokenHeader() {
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
        return "JATokenHeader{" +
                "algorithm='" + algorithm + '\'' +
                ", tokenType='" + tokenType + '\'' +
                '}';
    }
}


class JATokenPayload {

    private String issuer
    private String subject
    private String referrer
    private String referrerIp
    private String userAgent
    private Long expiresIn
    private Long notUseBefore
    private Long issuedAt
    private String jatId
    private UUID userId
    private Long financialInstitutionId
    private List<String> permissions


    JATokenPayload() {
    }

    JATokenPayload(String issuer, String subject, String referrer, String referrerIp, String userAgent, Long expiresIn, Long notUseBefore, Long issuedAt, String jatId, UUID userId, Long financialInstitutionId, List<String> permissions) {
        this.issuer = issuer
        this.subject = subject
        this.referrer = referrer
        this.referrerIp = referrerIp
        this.userAgent = userAgent
        this.expiresIn = expiresIn
        this.notUseBefore = notUseBefore
        this.issuedAt = issuedAt
        this.jatId = jatId
        this.userId = userId
        this.financialInstitutionId = financialInstitutionId
        this.permissions = permissions
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

    String getJatId() {
        return jatId
    }

    void setJatId(String jatId) {
        this.jatId = jatId
    }

    UUID getUserId() {
        return userId
    }

    void setUserId(UUID userId) {
        this.userId = userId
    }

    Long getFinancialInstitutionId() {
        return financialInstitutionId
    }

    void setFinancialInstitutionId(Long financialInstitutionId) {
        this.financialInstitutionId = financialInstitutionId
    }

    List<String> getPermissions() {
        return permissions
    }

    void setPermissions(List<String> permissions) {
        this.permissions = permissions
    }


    @Override
    public String toString() {
        return "JATokenPayload{" +
                "issuer='" + issuer + '\'' +
                ", subject='" + subject + '\'' +
                ", referrer='" + referrer + '\'' +
                ", referrerIp='" + referrerIp + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", expiresIn=" + expiresIn +
                ", notUseBefore=" + notUseBefore +
                ", issuedAt=" + issuedAt +
                ", userId=" + userId +
                ", financialInstitutionId=" + financialInstitutionId +
                ", permissions=" + permissions +
                '}'
    }
}


