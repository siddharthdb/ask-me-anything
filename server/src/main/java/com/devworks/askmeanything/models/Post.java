package com.devworks.askmeanything.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "posts")
public class Post {

    @Id
    public String Id;

    public String title;

    public String description;

    public Date postedDate;

    @DBRef
    public User user;

    @DBRef
    public List<Reply> replies;
}
