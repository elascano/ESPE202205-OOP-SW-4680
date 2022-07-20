
package ec.edu.espe.computerstore.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.text.Document;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class ComputerController {
     
    
    private  MongoDatabase mongoDB = Connection.mongodb;

    private MongoCollection<Document> mongoCollection;

   

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
        
      
    }
    
    public void create()  {

        org.bson.Document document = model.buildDocument();

        mongoCollection.insertOne(document);

    }
}
