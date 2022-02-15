package com.devworks.askmeanything.models.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "profile")
public class Profile {
    @Id
    public String Id;

    public String email;

    public String firstName;

    public String lastName;

    public String aboutMe;

    public String twitter;

    public String facebook;

    public String LinkedIn;

    public List<Group> groups;

    public Integer Score;
}
