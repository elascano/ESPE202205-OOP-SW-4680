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
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class MongoDBManager extends NoSqlManager {

    @Override
    public void create() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
        Document document;
        Scanner input;
        String dataforDB;
        
        userDB= Connection();
        userdatabase=userDB.getDatabase("MonitorDataBase");
        userCollection= userdatabase.getCollection("Monitor");
        
        document=new Document();
        input= new Scanner(System.in);
        
        System.out.println("Enter the monitor data:\n");
        System.out.println("enter the monitor brand:");
        dataforDB= input.next();
        document.append("monitorBrand",dataforDB);
        
        System.out.println("\n Enter the monitor frequency:");
        dataforDB= input.next();
        document.append("monitorFrequency",dataforDB);
        
        userCollection.insertOne(document);
    }

    @Override
    public void read() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
                
        userDB= Connection();
        userdatabase=userDB.getDatabase("MonitorDataBase");
        userCollection= userdatabase.getCollection("Monitor");
        
        MongoCollection<Document> collection = userdatabase.getCollection("Monitor");
      
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
        userdatabase=userDB.getDatabase("MonitorDataBase");
        userCollection= userdatabase.getCollection("Monitor");

        String upData;
        
        System.out.println("Database Connected");
        System.out.println("search the Monitor Brand you want to uptade");
        upData= input.next();
        Document found =(Document) userCollection.find(new Document("monitorBrand",upData)).first();
        
        if(found !=null){
            System.out.println("Found Monitor");
            System.out.println("Write the new name");
            upData= input.next();
            Bson updatedValue = new Document("monitorBrand",upData);
            Bson updateOperation = new Document("$set",updatedValue);
            userCollection.updateOne(found, updateOperation);
            System.out.println("Monitor Brand Updated");
        }
    }

    @Override
    public void delete() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
        Scanner input;
        String delete;
        MongoCollection<Document> collection;

        userDB = Connection();
        input = new Scanner(System.in);
        userdatabase=userDB.getDatabase("MonitorDataBase");
        userCollection= userdatabase.getCollection("Monitor");
        
        //Deleting a document
        System.out.println("Enter the monitor brand you want to delete: ");
        delete=input.next();
        
        userCollection.deleteOne(Filters.eq("monitorBrand", delete));
        
        System.out.println("Document deleted successfully...");
        //Retrieving the documents after the delete operation
        read();
    }
    
    public MongoClient Connection(){
        String uri="mongodb+srv://RansilvaV29:RansilvaV29@cluster0.afitt.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI clientURI;
        MongoClient mongoClient;
        
        clientURI= new MongoClientURI(uri);
        mongoClient = new MongoClient(clientURI);

        
        System.out.println("Conexion Exitosa");
        return mongoClient;
        //mongoClient.getDatabase(uri).forEach(System.out::println);
    }
}
