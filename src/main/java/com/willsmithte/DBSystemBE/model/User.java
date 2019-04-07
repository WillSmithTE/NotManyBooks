package com.willsmithte.DBSystemBE.model;

import org.bson.BsonDocument;
import org.bson.BsonString;
import org.bson.BsonValue;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

import static com.willsmithte.DBSystemBE.util.Consts.*;

/**
 * Created by Will Smith on 15/3/19.
 */
public class User extends Entity {

    public User(String name, String email, String password, Location location) {
        super(name, email, password, location);
    }

    public User(RegistrationRequest registrationRequest) {
        this(
                registrationRequest.getName(),
                registrationRequest.getEmail(),
                registrationRequest.getPassword(),
                registrationRequest.getLocation()
        );
    }
}
