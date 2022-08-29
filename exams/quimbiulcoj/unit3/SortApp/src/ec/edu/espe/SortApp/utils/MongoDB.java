package ec.edu.espe.SortApp.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class MongoDB {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://jdquimbiulco:jdquimbiulco@cluster0.vv6hc.mongodb.net/?retryWrites=true&w=majority";
        String db = "Exam";
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
