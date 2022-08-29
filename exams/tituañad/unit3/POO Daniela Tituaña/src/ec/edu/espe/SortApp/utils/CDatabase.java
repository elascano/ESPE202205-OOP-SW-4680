package ec.edu.espe.SortApp.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class CDatabase {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://dltituana1:dltituana1@cluster0.il40qoh.mongodb.net/test";
        String db = "Exam3P";
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            mongodb = mongoClient.getDatabase(db);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static MongoDatabase getConnection() {
        return mongodb;
    }

}
