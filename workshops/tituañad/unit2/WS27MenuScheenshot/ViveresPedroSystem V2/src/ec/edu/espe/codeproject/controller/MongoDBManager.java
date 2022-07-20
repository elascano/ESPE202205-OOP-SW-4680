package ec.edu.espe.codeproject.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.codeproject.model.Cashier;
import org.bson.Document;



/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class MongoDBManager {

    String collection;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;

        String uri = "mongodb+srv://dltituana1:dltituana1@cluster0.il40qoh.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Successful Connection");

        userdatabase = client.getDatabase("Proyect");

        return userdatabase;

    }

    
    public void CreateCashier(Cashier cashier) {

        MongoDatabase userDB;
        MongoCollection userCollection;
        Document document;
        
        userDB = EstablishConnection();
        userCollection = userDB.getCollection("Cashier");

        document = new Document();
        
        document.append("Id", cashier.getId());
        document.append("Name", cashier.getName());
        document.append("Address", cashier.getAdress());
        document.append("CellPhone", cashier.getCellPhone());
        document.append("Email", cashier.getEmail());
    

        userCollection.insertOne(document);

    }


    

}
