package com.willsmithte.DBSystemBE.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by Will Smith on 4/4/19.
 */

public class Entity {

    @Id
    private ObjectId _id;
    private String name;
    private EmailRecord emailRecord;
    private List<Donation> history;
    private String password;
    private Location location;
    private String description;

    public Entity() {}

    public Entity(String name, String email, String password, Location location) {
        this.name = name;
        this.emailRecord = new EmailRecord(email);
        this.password = password;
        this.location = location;
    }

    public ObjectId get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public EmailRecord getEmailRecord() {
        return emailRecord;
    }

    public List<Donation> getHistory() {
        return history;
    }

    public String getPassword() {
        return password;
    }

    public Location getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public void confirmEmail() {
        this.emailRecord.confirm();
    }
}
