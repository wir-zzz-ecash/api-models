package com.wirecash.api.models.Request;

public class AuthenticateRequest {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthenticateRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    public AuthenticateRequest withPassword(String password) {
        this.password = password;
        return this;
    }
}
