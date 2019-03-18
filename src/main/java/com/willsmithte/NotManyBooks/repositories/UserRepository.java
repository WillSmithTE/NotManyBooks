package com.willsmithte.NotManyBooks.repositories;

import com.willsmithte.NotManyBooks.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by Will Smith on 16/3/19.
 */

public interface UserRepository extends MongoRepository<User, Integer> {
    User findBy_id(ObjectId _id);
}
