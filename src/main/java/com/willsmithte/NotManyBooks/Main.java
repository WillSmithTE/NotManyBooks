package com.willsmithte.NotManyBooks;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Will Smith on 10/3/19.
 */
public class Main {

    private static String DATABASE_NAME = "test";

    public static void main(String[] args) {
        try {
            MongoClient mongoClient = new MongoClient();
            MongoDatabase db = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<BsonDocument> users = db.getCollection("users", BsonDocument.class);
//            User user1 = User.createAndInsert(users, "dufus", "dufus@gmail.com");
            MongoCollection<BsonDocument> books = db.getCollection("books", BsonDocument.class);
            List<BsonDocument> list = new ArrayList<BsonDocument>();
//            list.add()
//            books.insertM;
            System.out.println("we good");
        } catch (Exception e) {
            System.out.println("bad: " + e.toString());
        }
    }
}
