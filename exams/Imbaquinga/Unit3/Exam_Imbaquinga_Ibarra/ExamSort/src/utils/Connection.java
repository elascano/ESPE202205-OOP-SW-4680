package utils;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClientSettings;


/**
 *
 * @author Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class Connection {

    ConnectionString connectionString = new ConnectionString("mongodb+srv://admin:admin@cluster0.kp5wq4w.mongodb.net/?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Examen3");

    public MongoDatabase data() {
        return database;
    }
}
