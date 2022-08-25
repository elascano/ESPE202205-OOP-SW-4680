package ec.edu.espe.exam.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.Exam.model.SortNumbers;
import org.bson.Document;


/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class MongoDBManager {

    String collection;
    MongoDatabase FinalExamDB;
    MongoCollection examCollection;
    Document document;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;

        String uri = "mongodb+srv://RansilvaV29:RansilvaV29@cluster0.afitt.mongodb.net/test";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI) {};
        System.out.println("succesfull conection");

        userdatabase = client.getDatabase("FinalExam");

        return userdatabase;

    }

    public void CreateNumber(SortNumbers sortNumbers) {

        FinalExamDB = EstablishConnection();
        examCollection = FinalExamDB.getCollection("Numbers");

        document = new Document();

        document.append("Numbers", sortNumbers.getNumbers());
        document.append("Algorithm", sortNumbers.getAlgorithm());
        document.append("Size", sortNumbers.getSize());
        document.append("Unsorted", sortNumbers.getUnsorted());
        document.append("Ordenated", sortNumbers.getOrdenated());
      
        examCollection.insertOne(document);
    }


}
