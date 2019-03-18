package com.willsmithte.NotManyBooks.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Created by Will Smith on 16/3/19.
 */
public class Listing {
    @Id
    private ObjectId id;
    private ObjectId bookId;
    private Location location;

    public Listing(ObjectId bookId, Location location) {
        this.bookId = bookId;
        this.location = location;
    }
}
