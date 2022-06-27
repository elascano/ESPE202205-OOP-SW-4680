package espe.edu.ec.view;

import com.mongodb.DB;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author David Montufar, DCCO- ESPE, GADC.MSI
 */
public class CarApp {

    
    public static void main(String[] args) {
        
        
        String db = "Car";
        String collectionCusomers="Mazda";
        String uri = "mongodb+srv://DavidAriel:Vengadores22@mongodbhw13.s235z.mongodb.net/test";
        
        
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            MongoDatabase mongoDB= mongoClient.getDatabase(db);
            MongoCollection mongoCollection = mongoDB.getCollection(collectionCusomers);
            MongoCollection mongoCollectionMazda = mongoDB.getCollection("mazda");
            
            Document doc = new Document("car", "Mazda").append("color", "red").append("Ciudad", "Quito");
           
            mongoCollection.insertOne(doc);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
