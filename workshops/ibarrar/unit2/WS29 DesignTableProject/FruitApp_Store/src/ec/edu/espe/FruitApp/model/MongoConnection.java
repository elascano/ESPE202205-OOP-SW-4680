package ec.edu.espe.fruitApp.model;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class MongoConnection {
     String collection;
      public MongoClient conectionMongo(){
        String uri="mongodb+srv://ronnyibarra21:RonnyIbarra21@cluster0.2khytud.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI clientURI;
        MongoClient client;
       
        clientURI= new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");
        return client;
      }
}
