package ec.edu.espe.examvehicles.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.examvehicles.model.Connection;
import ec.edu.espe.examvehicles.model.Vehicle;
import org.bson.Document;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class ConnectionController {
    Vehicle vehicle; 
    MongoDatabase mongoDB = Connection.mongodb;

    MongoCollection<Document> mongoCollection;
    
    public void create()  {

        Document document = vehicle.buildDocument();

        mongoCollection.insertOne(document);

    }
}
