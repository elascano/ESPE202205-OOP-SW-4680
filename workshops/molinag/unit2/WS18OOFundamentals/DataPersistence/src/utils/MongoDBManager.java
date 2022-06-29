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
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class MongoDBManager extends NoSqIManager{
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
        userdatabase=userDB.getDatabase("POO");
        userCollection= userdatabase.getCollection("Games");
        
        document=new Document();
        input= new Scanner(System.in);
        
        System.out.println("Enter the games data:\n");
        System.out.println("Enter the game name:");
        dataforDB= input.next();
        document.append("name",dataforDB);
        
        System.out.println("\n Enter the number of downloads:");
        dataforDB= input.next();
        document.append("numberOfDownloads",dataforDB);
       
        System.out.println("\n Enter the year of release:");
        dataforDB= input.next();
        document.append("yearOfRelease",dataforDB);    
        userCollection.insertOne(document);
    }

    @Override
    public void read() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
                
        userDB= Connection();
        userdatabase=userDB.getDatabase("POO");
        userCollection= userdatabase.getCollection("Games");
        
        MongoCollection<Document> collection = userdatabase.getCollection("Games");
      
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
        userdatabase=userDB.getDatabase("POO");
        userCollection= userdatabase.getCollection("Games");

        String upData;
        
        System.out.println("Database Connected");
        System.out.println("search the names of the game you want to uptade");
        upData= input.next();
        Document found =(Document) userCollection.find(new Document("name",upData)).first();
        
        if(found !=null){
            System.out.println("Found Game");
            System.out.println("Write the new name");
            upData= input.next();
            Bson updatedValue = new Document("name",upData);
            Bson updateOperation = new Document("$set",updatedValue);
            userCollection.updateOne(found, updateOperation);
            System.out.println("Game name Updated");
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
        userdatabase=userDB.getDatabase("POO");
        userCollection= userdatabase.getCollection("Games");
        
        //Deleting a document
        System.out.println("Enter the name of the game you want to delete: ");
        delete=input.next();
        
        userCollection.deleteOne(Filters.eq("name", delete));
        
        System.out.println("Document deleted successfully...");
        //Retrieving the documents after the delete operation
        read();
    }
    
    public MongoClient Connection(){
        String uri="mongodb+srv://Steven1:holaxd@cluster0.kgejk.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI clientURI;
        MongoClient mongoClient;
        
        clientURI= new MongoClientURI(uri);
        mongoClient = new MongoClient(clientURI);

        
        System.out.println("Conexion Exitosa");
        return mongoClient;
        //mongoClient.getDatabase(uri).forEach(System.out::println);
    }
}

