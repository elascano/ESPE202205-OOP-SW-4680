package ec.edu.espe.SoccerPlayers.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class DataBaseManagerController {
    public static MongoDatabase database = null;
    
    
    public MongoDatabase conectionDb(){
        MongoClient mongoClient = (MongoClient) MongoClients.create("mongodb://localhost:27017");
        DataBaseManagerController.database = mongoClient.getDatabase("SoocerPlayers");
        return DataBaseManagerController.database;
    }
}
