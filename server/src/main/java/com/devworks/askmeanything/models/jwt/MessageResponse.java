package com.devworks.askmeanything.models.jwt;

import lombok.Getter;
import lombok.Setter;

public class MessageResponse {

    @Getter
    @Setter
    private String message;

    @Getter
    @Setter
    private String status;

    public MessageResponse(String message) {
        this.setMessage(message);
    }
}
