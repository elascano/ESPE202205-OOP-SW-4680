
package espe.edu.ec.CoopLatinaMarco.model;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Connection {

    public static MongoDatabase mongodb = null;

    public MongoDatabase connectionDataBase() {

        if (mongodb == null) {
            String uri = "mongodb+srv://CesarL:Almendra01@cluster0.izbkb5m.mongodb.net/?retryWrites=true&w=majority";
            String db = "CoopLatina";

            MongoClient mongoClient = MongoClients.create(uri);
            
            Connection.mongodb = mongoClient.getDatabase(db);
        }

        return Connection.mongodb;

    }
    
}
