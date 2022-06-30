
package pruebamongo;

import com.mongodb.DB;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class PruebaMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String host = "fruit-shard-00-02.yfe8t.mongodb.net:27017";
       
        
        
        String db = "fruteria";
        String collectionfruteria="frutas";
        String uri = "mongodb+srv://CesarL:relmapagoazul@fruit.yfe8t.mongodb.net/?retryWrites=true&w=majority";
      
        
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            MongoDatabase mongoDB= mongoClient.getDatabase(db);
            MongoCollection mongoCollection = mongoDB.getCollection(collectionfruteria);
            MongoCollection mongoCollectiofuteria = mongoDB.getCollection("frutas");
            
            Document doc = new Document("name", "apple").append("From", "Andes");
            mongoCollectiofuteria.insertOne(doc);
            
            Document doc2 = new Document("name", "banana").append("From", "Coast");
           
            mongoCollection.insertOne(doc2);
            
            // Document doc = new Document("name", "apple").append("color", "red").append("value", "25");
        } catch (Exception e) {
            System.out.println(e);
        }
  
        
        
       
    }
    
    
}
