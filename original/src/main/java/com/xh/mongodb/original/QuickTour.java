package com.xh.mongodb.original;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class QuickTour {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient();
        MongoDatabase database = mongoClient.getDatabase("test-xh");
        MongoCollection<Document> collection = database.getCollection("customer");
        /**
        MongoCursor<Document> cursor = collection.find().iterator();
        try {
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }
         **/

        for (Document cur : collection.find()) {
            System.out.println(cur.toJson());
        }
        mongoClient.close();

    }
}
