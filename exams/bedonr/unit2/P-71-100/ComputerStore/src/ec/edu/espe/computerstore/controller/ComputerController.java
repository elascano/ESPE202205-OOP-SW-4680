
package ec.edu.espe.computerstore.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.computerstore.model.computers;
import org.bson.Document;


/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class ComputerController {
     
    computers computer;
    private  MongoDatabase mongoDB=Connection.mongodb;

    private MongoCollection<Document> mongoCollection;

     public ComputerController(computers computer, String collectionName) {
        this.computer = computer;
        this.mongoCollection = mongoDB.getCollection(collectionName);
    }
     public ComputerController() {
        this.computer = new computers();
        this.mongoCollection = mongoDB.getCollection("computers");
    }

   

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
        
      
    }
    
    public Document read(String id,String fieldName) {
        
        return mongoCollection.find(eq(fieldName,id)).first();
    }
}
