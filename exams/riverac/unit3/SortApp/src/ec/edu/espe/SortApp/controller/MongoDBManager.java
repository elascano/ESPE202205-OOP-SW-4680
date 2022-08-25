package ec.edu.espe.SortApp.controller;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.SortApp.model.SortApp;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class MongoDBManager {

    String collection;
    MongoDatabase ExamDB;
    MongoCollection ExamCollection;
    Document document;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;

        String uri = "mongodb+srv://jdquimbiulco:jdquimbiulco@cluster0.vv6hc.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("succesfull conection");

        userdatabase = client.getDatabase("Exam");

        return userdatabase;

    }

    public void CreateAlgorithm(SortApp sortApp) {

        ExamDB = EstablishConnection();
        ExamCollection = ExamDB.getCollection("Algorithms");

        document = new Document();

        document.append("Algorithm", sortApp.getAlgorithm());
        document.append("Size", sortApp.getSize());
        document.append("Unsorted", sortApp.getUnsorted());
        document.append("Sort List", sortApp.getUnsorted());
      
        ExamCollection.insertOne(document);
    }

}

    