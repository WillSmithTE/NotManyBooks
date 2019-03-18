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
    public ObjectId _id;
    public String name;
    public String email;
    public BookHolding books;

    public User() {

    }

    public User(ObjectId _id, String name, String email) {
        this._id = _id;
        this.name = name;
        this.email = email;
    }

    public BsonDocument makeBsonDoc() {
        return new BsonDocument().append(NAME_FIELD, new BsonString(this.name))
                .append(EMAIL_FIELD, new BsonString(this.email));
    }

    public String get_id() {
        return this._id.toHexString();
    }

    public void set_id(ObjectId id) {
        this._id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BookHolding getBooks() {
        return books;
    }

    public void setBooks(BookHolding books) {
        this.books = books;
    }

    private void setId(BsonValue id) {
        this._id = id.asObjectId().getValue();
    }

//    public static User createAndInsert(MongoCollection<BsonDocument> db, String name, String email) {
//        User user = new User(name, email);
//        db.insertOne(user.makeBsonDoc());
//        BsonDocument document = db.find().sort(new BsonDocument("_id", new BsonInt32(-1))).first();
//        user.setId(document.get(ID_FIELD));
//        return user;
//    }

}
