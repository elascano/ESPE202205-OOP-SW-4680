package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Chavez Genaro DCCO-ESPE
 */
public class Connection {

    ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Sort");

    public MongoDatabase data() {
        return database;
    }
}
