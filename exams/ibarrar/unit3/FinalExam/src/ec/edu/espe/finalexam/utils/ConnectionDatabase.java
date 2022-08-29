
package ec.edu.espe.finalexam.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Ronny Ibarra, Ricardo Imbaquinga, DCCO- ESPE, Syntax Error
 */
public class ConnectionDatabase {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://ronnyibarra21:RonnyIbarra21@cluster0.2khytud.mongodb.net/?retryWrites=true&w=majority";
        String db = "Examen3";
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
