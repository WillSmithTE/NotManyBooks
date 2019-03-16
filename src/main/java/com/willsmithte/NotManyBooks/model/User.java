package com.willsmithte.NotManyBooks.model;

import com.mongodb.client.MongoCollection;
import org.bson.BsonDocument;
import org.bson.BsonInt32;
import org.bson.BsonString;
import org.bson.BsonValue;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import static com.willsmithte.NotManyBooks.util.Consts.*;

/**
 * Created by Will Smith on 15/3/19.
 */
public class User {

    @Id
    private ObjectId id;
    private String name;
    private String email;
    private BookHolding books;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public BsonDocument makeBsonDoc() {
        return new BsonDocument().append(NAME_FIELD, new BsonString(this.name))
                .append(EMAIL_FIELD, new BsonString(this.email));
    }

    public String getId() {
        return this.id.toHexString();
    }

    private void setId(BsonValue id) {
        this.id = id.asObjectId().getValue();
    }

    public static User createAndInsert(MongoCollection<BsonDocument> db, String name, String email) {
        User user = new User(name, email);
        db.insertOne(user.makeBsonDoc());
        BsonDocument document = db.find().sort(new BsonDocument("_id", new BsonInt32(-1))).first();
        user.setId(document.get(ID_FIELD));
        return user;
    }

}
