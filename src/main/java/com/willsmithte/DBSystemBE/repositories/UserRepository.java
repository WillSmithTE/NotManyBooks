package com.willsmithte.DBSystemBE.repositories;

import com.willsmithte.DBSystemBE.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Will Smith on 16/3/19.
 */

public interface UserRepository extends CrudRepository<User, Integer> {
    User findBy_id(ObjectId _id);

    User findByEmailRecord(String email);
}
