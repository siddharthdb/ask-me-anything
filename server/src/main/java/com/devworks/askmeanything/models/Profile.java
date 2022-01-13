package com.devworks.askmeanything.models;

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

    public String twitterId;

    public String facebookId;

    public String LinkedInId;

    public List<Group> groups;

    public Integer Score;
}
