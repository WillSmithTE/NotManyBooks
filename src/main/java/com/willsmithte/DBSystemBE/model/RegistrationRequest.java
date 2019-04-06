package com.willsmithte.DBSystemBE.model;

/**
 * Created by Will Smith on 4/4/19.
 */

public class RegistrationRequest {
    private String email;
    private String name;
    private String password;
    private Location location;

    public RegistrationRequest(String email, String name, String password, Location location) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Location getLocation() {
        return location;
    }
}
