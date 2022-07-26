/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.Iterator;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class MongoDBManager extends NoSqlManager{

    String collection;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;

        String uri = "mongodb+srv://jairo:jairo@jqdatabase.0xyetay.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");

        userdatabase = client.getDatabase("JAIRO");

        return userdatabase;

    }

    @Override
    public void Create() {

        MongoDatabase userDB;
        MongoCollection userCollection;
        Document document;
        Scanner input;
        String dataforDB;

        userDB = EstablishConnection();
        userCollection = userDB.getCollection("HeadPhones");

        document = new Document();
        input = new Scanner(System.in);

        System.out.println("Ingresar datos de Audifonos\n");
        System.out.println("Ingrese la marca de los audifonos:");
        dataforDB = input.next();
        document.append("branch", dataforDB);

        System.out.println("\n Ingrese el color de los audifonos:");
        dataforDB = input.next();
        document.append("Color", dataforDB);

        userCollection.insertOne(document);

    }

    @Override
    public void Read() {
        MongoDatabase userDB;
        MongoCollection<Document> collection;
        userDB = EstablishConnection();
        FindIterable<Document> iterDoc;
                
        collection= userDB.getCollection("HeadPhones");
        iterDoc = collection.find();

        
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    @Override
    public void Update() {

        MongoDatabase userDB;
        MongoCollection userCollection;
        Scanner input;
        String upData;

        userDB = EstablishConnection();
        userCollection = userDB.getCollection("HeadPhones");
        input = new Scanner(System.in);

        

        System.out.println("search the brand of headphones you want to uptade");
        upData = input.next();
        Document found = (Document) userCollection.find(new Document("branch", upData)).first();

        if (found != null) {
            System.out.println("Found HeadPhones");
            System.out.println("Write the new Color");
            upData = input.next();
            Bson updatedValue = new Document("Color", upData);
            Bson updateOperation = new Document("$set", updatedValue);
            userCollection.updateOne(found, updateOperation);
            System.out.println("HeadPhones Color Updated");
        }
    }

    @Override
    public void Delete() {
        
        MongoDatabase userDB;
        Scanner input;
        String delete;
        MongoCollection<Document> collection;

        userDB = EstablishConnection();
        input = new Scanner(System.in);
        collection = userDB.getCollection("HeadPhones");
        
        //Deleting a document
        System.out.println("Enter the name of brand you want to delete");
        delete=input.next();
        
        collection.deleteOne(Filters.eq("branch", delete));
        
        System.out.println("Document deleted successfully...");
        //Retrieving the documents after the delete operation
        Read();

    }

    @Override
    public void insert() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
