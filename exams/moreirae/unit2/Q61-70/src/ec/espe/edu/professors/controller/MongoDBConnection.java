

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class MongoDBConnection {
          public MongoClient conectionMongo(){
        String uri="mongodb+srv://erickm:erickm@cluster0.kqaq1.mongodb.net/test";
        MongoClientURI clientURI;
        MongoClient client;
       
        clientURI= new MongoClientURI(uri);
        client = new MongoClient(clientURI);
      System.out.println("Conexion Exitosa");
        
        return client;
      }
}
