package refrigerator;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;





/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Refrigerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String db = "refrigerator";   //Nombre de la base de datos
        String collectionRefrigerators = "refrigerators";
        
        String uri = "mongodb+srv://alexbg:alexbg@refrigerator.bzwk3hu.mongodb.net/?retryWrites=true&w=majority";
        
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            MongoDatabase mongoDB= mongoClient.getDatabase(db);
            MongoCollection mongoCollection = mongoDB.getCollection(collectionRefrigerators);
            
            
            Document doc1 = new Document("name", "refrigerator").append("Type","Mabe").append("cost","$800").append("Code","148756");
            mongoCollection.insertOne(doc1);
            
            Document doc2 = new Document("name", "refrigerator").append("Type","Umco").append("cost","$900").append("Code","144156");
            mongoCollection.insertOne(doc2);
            
            Document doc3 = new Document("name", "refrigerator").append("Type","LG").append("cost","$1000").append("Code","144576");
            mongoCollection.insertOne(doc3);
            
            Document doc4 = new Document("name", "refrigerator").append("Type","Samsung").append("cost","$1200").append("Code","569876");
            mongoCollection.insertOne(doc4);
           
            Document doc5 = new Document("name", "refrigerator").append("Type","Umco").append("cost","$1500").append("Code","159756");
            mongoCollection.insertOne(doc5);
            
            
       
                    
                    
        }catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
    }
    
}
