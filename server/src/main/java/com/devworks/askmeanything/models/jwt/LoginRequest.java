package com.devworks.askmeanything.models.jwt;

import lombok.Getter;
import lombok.Setter;

public class LoginRequest {

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;


    public LoginRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }
}