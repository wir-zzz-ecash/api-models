package com.wirecash.api.models.Request;

public class RefreshTokenRequest {
    private String username;
    private String refresh_token;
    private String access_token;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public RefreshTokenRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    public RefreshTokenRequest withRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
        return this;
    }

    public RefreshTokenRequest withAccess_token(String access_token) {
        this.access_token = access_token;
        return this;
    }
}
