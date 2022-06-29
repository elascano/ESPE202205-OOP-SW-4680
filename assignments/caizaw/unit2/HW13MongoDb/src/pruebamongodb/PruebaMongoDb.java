package pruebamongodb;

import com.mongodb.DB;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class PruebaMongoDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        String host = "cluster0-shard-00-02.smxif.mongodb.net:27017";
        
        
        String db = "customer";
        String collectionCusomers="customers";
        String uri = "mongodb+srv://danilo:danilo123@cluster0.smxif.mongodb.net/test";
        
        
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            MongoDatabase mongoDB= mongoClient.getDatabase(db);
            MongoCollection mongoCollection = mongoDB.getCollection(collectionCusomers);
            MongoCollection mongoCollectionCustomers = mongoDB.getCollection("customers");
            
            MongoCollection<Document> collectionCustomersFind = mongoDB.getCollection("Customers");
            
            Document doc2 = new Document("name", "Pablo").append("id", "096").append("Ciudad", "Quito");
            
            mongoCollectionCustomers.insertOne(doc2);
            Document doc = new Document("name", "Widinson").append("id", "059").append("Ciudad", "Latacunga");
            mongoCollection.insertOne(doc);
            Document docBusar = (Document) collectionCustomersFind.find(eq("name","Maria")).first();
            System.out.println(docBusar.get("name"));
            System.out.println(docBusar.toJson());
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
