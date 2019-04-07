package com.willsmithte.DBSystemBE.model;

/**
 * Created by Will Smith on 4/4/19.
 */
public class EmailRecord {
    private String email;
    private boolean isConfirmed = false;

    public EmailRecord(String email) {
        this.email = email;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void confirm() {
        isConfirmed = true;
    }
}
