/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Iterator;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class MongoDBManager extends NoSqlManager{

String collection;

    @Override
    public void create() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
        Document document;
        Scanner input;
        String dataforDB;
        
        userDB= Connection();
        userdatabase=userDB.getDatabase("Skateboard");
        userCollection= userdatabase.getCollection("Deck");
        
        document=new Document();
        input= new Scanner(System.in);
        
        System.out.println("Enter the skatebpoard data:\n");
        System.out.println("enter the skateboard brand:");
        dataforDB= input.next();
        document.append("deckBrand",dataforDB);
        
        System.out.println("\n Enter de skateboard size:");
        dataforDB= input.next();
        document.append("deckSize",dataforDB);
        
        System.out.println("\n Enter de skateboard amount:");
        dataforDB= input.next();
        document.append("deckAmount",dataforDB);
        
        userCollection.insertOne(document);
    }

    @Override
    public void read() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
                
        userDB= Connection();
        userdatabase=userDB.getDatabase("Skateboard");
        userCollection= userdatabase.getCollection("Deck");
        
        MongoCollection<Document> collection = userdatabase.getCollection("Deck");
      
        FindIterable<Document> iterDoc = collection.find();
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
         System.out.println(it.next());
        }
    }

    @Override
    public void update() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
        Document document;
        Scanner input;
        input = new Scanner(System.in);
        
        userDB= Connection();
        userdatabase=userDB.getDatabase("Skateboard");
        userCollection= userdatabase.getCollection("Deck");

        String upData;
        
        System.out.println("Database Connected");
        System.out.println("search the DeckBrand you want to uptade");
        upData= input.next();
        Document found =(Document) userCollection.find(new Document("deckBrand",upData)).first();
        
        if(found !=null){
            System.out.println("Found Deck");
            System.out.println("Write the new name");
            upData= input.next();
            Bson updatedValue = new Document("deckBrand",upData);
            Bson updateOperation = new Document("$set",updatedValue);
            userCollection.updateOne(found, updateOperation);
            System.out.println("Deck Brand Updated");
        }
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public MongoClient Connection(){
        String uri="mongodb+srv://jdquimbiulco:jdquimbiulco@cluster0.vv6hc.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI clientURI;
        MongoClient mongoClient;
        
        clientURI= new MongoClientURI(uri);
        mongoClient = new MongoClient(clientURI);

        
        System.out.println("Conexion Exitosa");
        return mongoClient;
        //mongoClient.getDatabase(uri).forEach(System.out::println);
    }
}


