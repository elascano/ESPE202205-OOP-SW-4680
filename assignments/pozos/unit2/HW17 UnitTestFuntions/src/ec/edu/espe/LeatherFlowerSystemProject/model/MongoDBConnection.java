
package ec.edu.espe.LeatherFlowerSystemProject.model;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class MongoDBConnection {
      String collection;
      public MongoClient conectionMongo(){
        String uri="mongodb+srv://stevenpozo12:stevenpozo12@cluster0.zjzsk9i.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI clientURI;
        MongoClient client;
       
        clientURI= new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");
        return client;
    }
}
