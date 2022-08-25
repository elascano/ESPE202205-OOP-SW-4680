package ec.edu.espe.OrderAlgorithms.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.OrderAlgorithms.model.SortApp;
import org.bson.Document;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class MongoDB {
    
    String collection;
    MongoDatabase ExamDB;
    MongoCollection ExamCollection;
    Document document;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;

        String uri = "mongodb+srv://Steven1:Steven1@cluster0.kgejk.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("succesfull conection");

        userdatabase = client.getDatabase("Exam");

        return userdatabase;

    }

    public void CreateAlgorithm(SortApp algoritmo) {

        ExamDB = EstablishConnection();
        ExamCollection = ExamDB.getCollection("Algorithms");

        document = new Document();

        document.append("Algorithm", algoritmo.getAlgorithm());
        document.append("Size", algoritmo.getSize());
        document.append("Unsorted", algoritmo.getUnsorted());
        document.append("Sort", algoritmo.getSort());
      
        ExamCollection.insertOne(document);
    }

    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}