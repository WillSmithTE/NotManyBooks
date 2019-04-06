package com.willsmithte.DBSystemBE.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Created by Will Smith on 4/4/19.
 */
public class Item {
    @Id
    private ObjectId _id;

}
