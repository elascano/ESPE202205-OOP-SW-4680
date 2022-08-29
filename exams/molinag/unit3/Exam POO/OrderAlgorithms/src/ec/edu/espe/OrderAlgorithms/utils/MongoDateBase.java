package ec.edu.espe.OrderAlgorithms.utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.OrderAlgorithms.model.SortApp;
import org.bson.Document;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class MongoDateBase {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://Steven1:Steven1@cluster0.kgejk.mongodb.net/?retryWrites=true&w=majority";
        String db = "Exam";
        try {
            com.mongodb.client.MongoClient mongoClient = MongoClients.create(uri);
            mongodb = mongoClient.getDatabase(db);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static MongoDatabase getConnection() {
        return mongodb;
    }

}
