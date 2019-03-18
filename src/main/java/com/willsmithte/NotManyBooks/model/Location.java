package com.willsmithte.NotManyBooks.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Created by Will Smith on 16/3/19.
 */
public class Location {

    @Id
    private ObjectId id;
    private String country;
    private String city;

    public ObjectId getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
