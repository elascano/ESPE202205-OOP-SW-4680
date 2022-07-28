package ec.edu.espe.forniture.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author 
 */
public class ConnectionDatabase {
    
    public static MongoDatabase database = null;
    
    public MongoDatabase connectDatabase(){
        
        if (database == null) {
            String uri = "mongodb+srv://admin:adminStylesIrealia@stylesirelia.by7pr.mongodb.net/?retryWrites=true&w=majority";
            String db = "exam";

            MongoClient mongoClient = MongoClients.create(uri);

            ConnectionDatabase.database = mongoClient.getDatabase(db);
        }
        
        
        return ConnectionDatabase.database;
    }
    
}
