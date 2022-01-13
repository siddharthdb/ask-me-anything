package com.devworks.askmeanything.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "groups")
public class Group {

    @Id
    public String Id;

    public String groupName;

    public String groupDescription;

}
