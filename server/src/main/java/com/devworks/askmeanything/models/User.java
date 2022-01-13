package com.devworks.askmeanything.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    public String Id;

    public String email;

    public String username;

    public String password;

    public String firstName;

    public String lastName;

    public void setUEncryptedPassword(String password) {
        this.password = password;
    }
}
