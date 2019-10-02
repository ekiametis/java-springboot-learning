package com.emmanuelkiametis.learningspringboot.learningspringboot.database.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {

    @Id
    private String id;
    private String name;

    public User(String name) {
        this.name = name;
    }
}
