package mongocrud;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE, DAMAGE SE
 */
public class Connection {

    public static MongoDatabase mongodb = null;

    public MongoDatabase connectionDataBase() {

        if (mongodb == null) {
            String uri = "mongodb+srv://Chiri:chiri@cluster0.zelysad.mongodb.net/?retryWrites=true&w=majority";
            String db = "Tables";
            String dbCollection = "tables";
            
            MongoClient mongoClient = MongoClients.create(uri);
        
            Connection.mongodb = mongoClient.getDatabase(db);
        }

        return Connection.mongodb;

    }
}
