package Utils;

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
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class MongoDBManager extends NoSqlManager{

    @Override
    public void create() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
        Document document;
        Scanner input;
        String dataforDB;
        
        userDB= Connection();
        userdatabase=userDB.getDatabase("PencilDataBase");
        userCollection= userdatabase.getCollection("Pencils");
        
        document=new Document();
        input= new Scanner(System.in);
        
        System.out.println("Enter the data of Pencils");
        System.out.println("Enter pencil brand: ");
        dataforDB= input.next();
        document.append("pencilBrand",dataforDB);
        
        System.out.println("\n Enter pencil type:");
        dataforDB= input.next();
        document.append("pencilType",dataforDB);
        
        userCollection.insertOne(document);
    
    }

    @Override
    public void read() {
    MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
                
        userDB= Connection();
        userdatabase=userDB.getDatabase("PencilDataBase");
        userCollection= userdatabase.getCollection("Pencils");
        
        MongoCollection<Document> collection = userdatabase.getCollection("Pencils");
      
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
        userdatabase=userDB.getDatabase("PencilDataBase");
        userCollection= userdatabase.getCollection("Pencils");

        String upData;
        
        System.out.println("Database Connected");
        System.out.println("Search the Pencil Brand you want to uptade: ");
        upData= input.next();
        Document found =(Document) userCollection.find(new Document("pencilBrand",upData)).first();
        
        if(found !=null){
            System.out.println("Found Pencil Brand");
            System.out.println("Write the new name");
            upData= input.next();
            Bson updatedValue = new Document("pencilBrand",upData);
            Bson updateOperation = new Document("$set",updatedValue);
            userCollection.updateOne(found, updateOperation);
            System.out.println("Pencil Brand Updated");
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
        userdatabase=userDB.getDatabase("PencilDataBase");
        userCollection= userdatabase.getCollection("Pencils");
        
        //Deleting a document
        System.out.println("Enter the name of pencil brand you want to delete: ");
        delete=input.next();
        
        userCollection.deleteOne(Filters.eq("pencilBrand", delete));
        
        System.out.println("Document deleted successfully...");
        //Retrieving the documents after the delete operation
        read();
    
    }

    @Override
    public void insert() {
    
    }

    public MongoClient Connection(){
        String uri="mongodb+srv://dltituana1:dltituana1@cluster0.il40qoh.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI clientURI;
        MongoClient mongoClient;
        
        clientURI= new MongoClientURI(uri);
        mongoClient = new MongoClient(clientURI);

        
        System.out.println("Conexion Exitosa");
        return mongoClient;
        //mongoClient.getDatabase(uri).forEach(System.out::println);
    }
}

    

