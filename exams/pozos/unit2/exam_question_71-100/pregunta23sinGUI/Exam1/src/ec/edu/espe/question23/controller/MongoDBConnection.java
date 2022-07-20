package ec.edu.espe.question23.controller;

import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class MongoDBConnection {
    
    public static MongoDatabase database = null;
    
    public MongoDatabase connectDatabase(){
        
        if (database == null) {
            String uri = "mongodb+srv://stevenpozo12:stevenpozo12@cluster0.zjzsk9i.mongodb.net/?retryWrites=true&w=majority";
            String db = "examOOP";

            MongoClient mongoClient = MongoClients.create(uri);

            MongoDBConnection.database = mongoClient.getDatabase(db);
        }
        
        
        return MongoDBConnection.database;
    }
    
    public com.mongodb.MongoClient conectionMongo(){
        String uri="mongodb+srv://stevenpozo12:stevenpozo12@cluster0.zjzsk9i.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI clientURI;
        com.mongodb.MongoClient client;
       
        clientURI= new MongoClientURI(uri);
        client = new com.mongodb.MongoClient(clientURI);
      //  System.out.println("Conexion Exitosa");
        
        return client;
      }

    
}
