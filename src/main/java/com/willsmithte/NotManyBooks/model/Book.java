package com.willsmithte.NotManyBooks.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Created by Will Smith on 15/3/19.
 */
public class Book {
    @Id
    private ObjectId id;
    private String name;
    private String author;
    private String description;
    private double price;
}
