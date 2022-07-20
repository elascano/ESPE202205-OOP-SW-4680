package espe.edu.ec.CoopLatinaMarco.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import espe.edu.ec.CoopLatinaMarco.model.Route;
import org.bson.Document;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class RoutesController {
       String collection;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;
        String uri = "mongodb+srv://Steven1:Steven1@cluster0.izbkb5m.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Successful connection");

        userdatabase = client.getDatabase("Routes");
        return userdatabase;
    }
    public void CreateRoute(Route routes) {

        MongoDatabase userDB;
        MongoCollection userCollection;
        Document document;
        
        userDB = EstablishConnection();
        userCollection = userDB.getCollection("Rutas");

        document = new Document();
        
        document.append("Name Route", routes.getNameRoute());
        document.append("Id Route", routes.getIdRoute());
        document.append("Distance KM", routes.getDistanceKm());
        document.append("price of route", routes.getPriceOfRoute());
        document.append("avaible routes", routes.isAvalibleRoute());

        userCollection.insertOne(document);

    }
}
