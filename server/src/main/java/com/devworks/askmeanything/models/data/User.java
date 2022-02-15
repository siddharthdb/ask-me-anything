package com.devworks.askmeanything.models.data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Document(collection = "users")
public class User {
    @Id
    @Getter
    @Setter
    private String Id;

    @Getter
    @Setter
    @Email
    @NotBlank
    @Size(max = 50)
    private String email;

    @Getter
    @Setter
    @NotBlank
    @Size(min = 8, max = 20)
    private String username;

    @Getter
    @Setter
    @NotBlank
    @Size(min = 8, max = 20)
    private String password;

    public void setUEncryptedPassword(String password) {
        this.password = password;
    }

    public User (String username, String email, String password) {
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
    }
}

