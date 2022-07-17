
package edu.espe.ec.spa.model;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class mongoConnection {
    
    String collection;
      public MongoClient conectionMongo(){
        String uri="mongodb+srv://erickm:erickm@cluster0.kqaq1.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI clientURI;
        MongoClient client;
       
        clientURI= new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");
        return client;
      }
    
}
