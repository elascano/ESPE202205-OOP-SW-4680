package ec.edu.espe.exam.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam.model.Building;
import org.bson.Document;



/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class MongoDBManager {
    String collection;
    MongoDatabase examDB;
    MongoCollection examCollection;
    Document document;
    
    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;
            
        String uri = "mongodb+srv://dltituana1:dltituana1@cluster0.il40qoh.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");

        userdatabase = client.getDatabase("Exam");

        return userdatabase;
        

    }
    public void CreateBuilding(Building building) {

        
        examDB = EstablishConnection();
        examCollection = examDB.getCollection("Building");

        document = new Document();
        
        document.append("Size", building.getSize());
        document.append("Floor Numbers", building.getNumberOfFloors());
        document.append("Type Building", building.getTypeOfBuilding());
        document.append("Material", building.getMaterial());
        document.append("cost", building.getCost());
       


        examCollection.insertOne(document);

    }
}
