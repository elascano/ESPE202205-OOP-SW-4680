package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class MongoDBManager extends NoSqlManager {

    String collection;

    @Override
    public void insert() {

    }

    public MongoClient conectionMongo() {
        String uri = "mongodb+srv://stevenpozo12:stevenpozo12@cluster0.zjzsk9i.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI clientURI;
        MongoClient client;

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");
        return client;
    }

    public boolean write() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
        Document document;
        Scanner input;
        String dateFruit;

        userDB = conectionMongo();
        userdatabase = userDB.getDatabase("fruits");
        userCollection = userdatabase.getCollection("color");

        document = new Document();
        input = new Scanner(System.in);

        System.out.println("Fruits");
        System.out.println("type fruit name");
        dateFruit = input.next();
        document.append("Fruit", dateFruit);

        System.out.println("type fruit color");
        dateFruit = input.next();
        document.append("Color", dateFruit);

        System.out.println("type fruit flavor");
        dateFruit = input.next();
        document.append("Flavor", dateFruit);

        System.out.println("type fruit height");
        dateFruit = input.next();
        document.append("Height", dateFruit);

        System.out.println("type fruit shape");
        dateFruit = input.next();
        document.append("Shape", dateFruit);
        userCollection.insertOne(document);
        return true;
    }

    public ArrayList<String> read() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;

        userDB = conectionMongo();
        userdatabase = userDB.getDatabase("fruits");
        userCollection = userdatabase.getCollection("color");

        MongoCollection<Document> collection = userdatabase.getCollection("color");

        FindIterable<Document> iterDoc = collection.find();
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        return null;

    }

    public boolean delete(String fileName, String criterion) {

        return false;
    }

    public ArrayList<String> find(String fileName, String criterion) {

        return null;

    }

    public boolean update() {

        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
        Document document;
        Scanner input;
        input = new Scanner(System.in);

        userDB = conectionMongo();
        userdatabase = userDB.getDatabase("fruit");
        userCollection = userdatabase.getCollection("color");

        String upData;

        System.out.println("Data Base");
        System.out.println("iside of Data Base");
        upData = input.next();
        Document found = (Document) userCollection.find(new Document("deckBrand", upData)).first();

        if (found != null) {
            System.out.println("Found Deck");
            System.out.println("Write the new name");
            upData = input.next();
            Bson updatedValue = new Document("deckBrand", upData);
            Bson updateOperation = new Document("$set", updatedValue);
            userCollection.updateOne(found, updateOperation);
            System.out.println("Deck Brand Updated");
        }
        return false;

    }

}
