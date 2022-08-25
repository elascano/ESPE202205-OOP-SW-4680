
package ec.edu.espe.sortapp.controller;

import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.sortapp.model.SortApp;
import org.bson.Document;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class connection {
    
    public class MongoDBManager {

    String collection;
    MongoDatabase ExamDB;
    MongoCollection ExamCollection;
    Document document;

    public MongoDatabase EstablishConnection() {
       
        
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;

        String uri = "mongodb+srv://alexbg:alexbg@refrigerator.bzwk3hu.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("connected");

        userdatabase = client.getDatabase("Sort");

        return userdatabase;

    }

    public void CreateAlgoritms(SortApp sortApp) {
        document = new Document();
        
        ExamDB = EstablishConnection();
        ExamCollection = ExamDB.getCollection("Algorithms");

        document = new Document();

        document.append("Algorithm", sortApp.getAlgorithm());
        document.append("Size", sortApp.getSize());
        document.append("Unsorted", sortApp.getNumbers());
        document.append("Sort List", sortApp.getList());
      
        ExamCollection.insertOne(document);
    }

}
}
