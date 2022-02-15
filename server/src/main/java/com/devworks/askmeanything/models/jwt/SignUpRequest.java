package com.devworks.askmeanything.models.jwt;

import lombok.Getter;
import lombok.Setter;

public class SignUpRequest {

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String email;

}
