package com.willsmithte.DBSystemBE.repositories;

import com.willsmithte.DBSystemBE.model.Item;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Will Smith on 4/4/19.
 */
public interface ItemRepository extends MongoRepository<Item, Integer> {
    Item findBy_id(ObjectId id);
}
