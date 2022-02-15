package com.devworks.askmeanything.models.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "replies")
public class Reply {

    @Id
    public String Id;

    public String reply;

    public Date repliedDate;

    public Boolean isBestReply;

    public Integer votes;

    public Boolean isAnswer;

    @DBRef
    public User repliedUser;

    @DBRef
    public Post post;
}
