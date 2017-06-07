package com.paymentcomponents.common.models

/**
 * Created by aalexandrakis on 23/02/2017.
 */
class ApiKey {
    private Long apiKeyId
    private UUID userId
    String apiKey
    String description
    boolean enabled
    Date createdAt

    User user

    ApiKey() {
    }

    ApiKey(UUID userId, String apiKey, boolean enabled, Date createdAt, String description) {
        this.userId = userId
        this.apiKey = apiKey
        this.enabled = enabled
        this.createdAt = createdAt
        this.description = description
    }

    Long getApiKeyId() {
        return apiKeyId
    }

    void setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId
    }

    UUID getUserId() {
        return userId
    }

    void setUserId(UUID userId) {
        this.userId = userId
    }

    String getApiKey() {
        return apiKey
    }

    void setApiKey(String apiKey) {
        this.apiKey = apiKey
    }

    boolean getEnabled() {
        return enabled
    }

    void setEnabled(boolean enabled) {
        this.enabled = enabled
    }

    Date getCreatedAt() {
        return createdAt
    }

    void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }

    User getUser() {
        return user
    }

    void setUser(User user) {
        this.user = user
    }

    @Override
    public String toString() {
        return "ApiKey{" +
                "apiKeyId=" + apiKeyId +
                ", userId=" + userId +
                ", description='" + description + '\'' +
                ", enabled=" + enabled +
                ", createdAt=" + createdAt +
                ", user=" + user +
                '}';
    }
}
