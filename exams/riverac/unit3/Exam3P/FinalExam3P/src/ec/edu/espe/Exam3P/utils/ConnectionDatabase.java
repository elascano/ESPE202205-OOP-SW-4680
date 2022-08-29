package ec.edu.espe.Exam3P.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class ConnectionDatabase {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://Carlos:mordecai13579tato123@testconection.5pwtjot.mongodb.net/test";
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
