
package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;


/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES Developers
 */

public class MongoDBConnection {

    ConnectionString connectionString = new ConnectionString("mongodb+srv://eapabon:020302@database.isgytys.mongodb.net/test");
    MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(connectionString).build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("EXAM3P");

    
    public MongoDatabase data() {
        return database;
    }
}
