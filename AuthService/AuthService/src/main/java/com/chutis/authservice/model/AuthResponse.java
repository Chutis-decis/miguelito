package com.chutis.authservice.model;

public class AuthResponse {
    private String jwt;

    // Constructor
    public AuthResponse(String jwt) {
        this.jwt = jwt;
    }

    // Getter
    public String getJwt() {
        return jwt;
    }

    // Setter
    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
