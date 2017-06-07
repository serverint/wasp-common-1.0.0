package com.paymentcomponents.common.models

class Log {
    String id
    String requestId
    String financialInstitutionId
    String method
    String path
    Date requestDate
    Date requestEndDate
    Double duration
    String remoteAddress
    String httpStatusCode
    String responseErrorCode

    def requestHeaders
    String requestPayload
    String responsePayload

    Log() {
    }

    Log(String id, String requestId, String financialInstitutionId, String method, String path, Date requestDate, Date requestEndDate, Double duration, String remoteAddress, String httpStatusCode, String responseErrorCode, requestHeaders, String requestPayload, String responsePayload) {
        this.id = id
        this.requestId = requestId
        this.financialInstitutionId = financialInstitutionId
        this.method = method
        this.path = path
        this.requestDate = requestDate
        this.requestEndDate = requestEndDate
        this.duration = duration
        this.remoteAddress = remoteAddress
        this.httpStatusCode = httpStatusCode
        this.responseErrorCode = responseErrorCode
        this.requestHeaders = requestHeaders
        this.requestPayload = requestPayload
        this.responsePayload = responsePayload
    }

    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    String getRequestId() {
        return requestId
    }

    void setRequestId(String requestId) {
        this.requestId = requestId
    }

    String getFinancialInstitutionId() {
        return financialInstitutionId
    }

    void setFinancialInstitutionId(String financialInstitutionId) {
        this.financialInstitutionId = financialInstitutionId
    }

    String getMethod() {
        return method
    }

    void setMethod(String method) {
        this.method = method
    }

    String getPath() {
        return path
    }

    void setPath(String path) {
        this.path = path
    }

    Date getRequestDate() {
        return requestDate
    }

    void setRequestDate(Date requestDate) {
        this.requestDate = requestDate
    }

    Date getRequestEndDate() {
        return requestEndDate
    }

    void setRequestEndDate(Date requestEndDate) {
        this.requestEndDate = requestEndDate
    }

    Double getDuration() {
        return duration
    }

    void setDuration(Double duration) {
        this.duration = duration
    }

    String getRemoteAddress() {
        return remoteAddress
    }

    void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress
    }

    String getHttpStatusCode() {
        return httpStatusCode
    }

    void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode
    }

    String getResponseErrorCode() {
        return responseErrorCode
    }

    void setResponseErrorCode(String responseErrorCode) {
        this.responseErrorCode = responseErrorCode
    }

    def getRequestHeaders() {
        return requestHeaders
    }

    void setRequestHeaders(requestHeaders) {
        this.requestHeaders = requestHeaders
    }

    String getRequestPayload() {
        return requestPayload
    }

    void setRequestPayload(String requestPayload) {
        this.requestPayload = requestPayload
    }

    String getResponsePayload() {
        return responsePayload
    }

    void setResponsePayload(String responsePayload) {
        this.responsePayload = responsePayload
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", requestId='" + requestId + '\'' +
                ", financialInstitutionId='" + financialInstitutionId + '\'' +
                ", method='" + method + '\'' +
                ", path='" + path + '\'' +
                ", requestDate=" + requestDate +
                ", requestEndDate=" + requestEndDate +
                ", duration=" + duration +
                ", remoteAddress='" + remoteAddress + '\'' +
                ", httpStatusCode='" + httpStatusCode + '\'' +
                ", responseErrorCode='" + responseErrorCode + '\'' +
                ", requestHeaders=" + requestHeaders +
                ", requestPayload='" + requestPayload + '\'' +
                ", responsePayload='" + responsePayload + '\'' +
                '}';
    }
}
