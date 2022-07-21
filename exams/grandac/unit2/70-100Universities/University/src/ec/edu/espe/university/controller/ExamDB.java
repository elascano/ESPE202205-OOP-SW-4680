package ec.edu.espe.university.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.university.model.University;
import org.bson.Document;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class ExamDB {
    
    String collection;
    MongoDatabase examDB;
    MongoCollection examCollection;
    Document document;
    
    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;
            
        String uri = "mongodb+srv://admin:admin@cluster0.kp5wq4w.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa a la base de datos");

        userdatabase = client.getDatabase("Universities");

        return userdatabase;

    }
    
        public void CreateBook(University university) {

        
        examDB = EstablishConnection();
        examCollection = examDB.getCollection("Universities");

        document = new Document();
        
        document.append("Name",university.getName());
        document.append("Year",university.getYear());
        document.append("Place",university.getPlace());
        document.append("Type",university.getType());


        examCollection.insertOne(document);

    }

    

}
