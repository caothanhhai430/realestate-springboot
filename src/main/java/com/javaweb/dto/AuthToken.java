package com.javaweb.dto;

public class AuthToken {
    private String token;

    public String getToken() {
        return token;
    }
    public AuthToken(String token){
        this.token = token;
    }
}
