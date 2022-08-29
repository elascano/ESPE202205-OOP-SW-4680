package utils;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Diego Ponce
 */
public class MongoDBManager {

    String collection;
    MongoDatabase bookifyDB;
    MongoCollection bookifyCollection;
    Document document;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;

        String uri = "mongodb+srv://diegoponce:<diegoponce>@cluster0.bbiyc.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("succesfull conection");

        userdatabase = client.getDatabase("SortMethods");

        return userdatabase;

    }

   

       public void CreateObject(Object elementObject, String collection) {
        bookifyDB = EstablishConnection();
        bookifyCollection = bookifyDB.getCollection(collection);
        Gson gson = new Gson();

        document = Document.parse(gson.toJson(elementObject));
        System.out.println("Succesfull convertion");

        bookifyCollection.insertOne(document);
        System.out.println("Succesfull added");

    }

    

    public Document findDocument(String atributeToFind, Object tofind, String collection) {

        bookifyDB = EstablishConnection();
        bookifyCollection = bookifyDB.getCollection(collection);
        Document found;
        Document foundtoReturn = null;

        document = new Document(atributeToFind, tofind);
        found = (Document) bookifyCollection.find(document).first();

        if (found != null) {
            foundtoReturn = found;
        } else {
            System.out.println("Document not found");

        }

        return foundtoReturn;

    }

}
