package ec.edu.espe.exam.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam.model.Tree;
import org.bson.Document;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
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
            
        String uri = "mongodb+srv://RansilvaV29:RansilvaV29@cluster0.afitt.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");

        userdatabase = client.getDatabase("Exam");

        return userdatabase;

    }
    
    public void CreateTree(Tree tree) {

        
        examDB = EstablishConnection();
        examCollection = examDB.getCollection("Tree");

        document = new Document();
        
        document.append("Age", tree.getAge());
        document.append("Type", tree.getType());
        document.append("FruitTree", tree.isFruitTree());
        document.append("TreeLeaves", tree.isTreeLeaves());
        document.append("Color", tree.getColor());

        examCollection.insertOne(document);

    }
}
