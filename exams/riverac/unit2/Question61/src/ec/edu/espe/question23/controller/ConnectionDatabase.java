package ec.edu.espe.question23.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class ConnectionDatabase {
    
    public static MongoDatabase database = null;
    
    public MongoDatabase connectDatabase(){
        
        if (database == null) {
            String uri = "mongodb+srv://<username>:<26102002>@movie.h4wfz3l.mongodb.net/?retryWrites=true&w=majority";
            String db = "exam";

            MongoClient mongoClient = MongoClients.create(uri);

            ConnectionDatabase.database = mongoClient.getDatabase(db);
        }
        
        
        return ConnectionDatabase.database;
    }
    
}
