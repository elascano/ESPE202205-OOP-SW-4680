package ec.edu.espe.question.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class ConnectionDatabase {
    
    public static MongoDatabase database = null;
    
    public MongoDatabase connectDatabase(){
        
        if (database == null) {
            String uri = "mongodb+srv://Matt:<12345>@pen.rcs1q.mongodb.net/?retryWrites=true&w=majority";
            String db = "pen";

            MongoClient mongoClient = MongoClients.create(uri);

            ConnectionDatabase.database = mongoClient.getDatabase(db);
        }
        
        
        return ConnectionDatabase.database;
    }
    
}
