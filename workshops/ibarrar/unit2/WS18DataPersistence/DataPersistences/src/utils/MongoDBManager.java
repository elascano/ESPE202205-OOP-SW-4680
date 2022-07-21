package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Ronny Ibarra, DCCO- ESPE, SyntaxError
 */
public class MongoDBManager extends NoSqlManager {
    
    public MongoClient MongoConnection(){
        String uri="mongodb+srv://ronnyibarra21:RonnyIbarra21@cluster0.2khytud.mongodb.net/?retryWrites=true&w=majority";
     MongoClientURI clientURI;
     MongoClient client;
        
     
    
        clientURI= new MongoClientURI(uri);
        client = new MongoClient(clientURI);

        
        return client;
    }

    public boolean write() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
        Document document;
        Scanner input;
        String dateClothe;
        
        userDB= MongoConnection();
        userdatabase=userDB.getDatabase("Clothes");
        userCollection= userdatabase.getCollection("Color");
        
        document=new Document();
        input= new Scanner(System.in);
        
        System.out.println("type brand name");
        dateClothe= input.next();
        document.append("brand",dateClothe);
        
        System.out.println("type clothe color");
        dateClothe= input.next();
        document.append("Color",dateClothe);
        
       
        System.out.println("type of price");
        dateClothe= input.next();
        document.append("price",dateClothe);
        
       
        userCollection.insertOne(document);
        return true;
       
    }

    public ArrayList<String> read() {
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
                
        userDB= MongoConnection();
        userdatabase=userDB.getDatabase("Clothes");
        userCollection= userdatabase.getCollection("Color");
        
        MongoCollection<Document> collection = userdatabase.getCollection("Color");
      
        FindIterable<Document> iterDoc = collection.find();
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
         System.out.println(it.next());
        }
        return null;
}
}

       

//
//    public boolean delet(String fileName, String criterion) {
//        return false;
//        
//       
//    }
//
//    public ArrayList<String> find(String fileName, String criterion) {
//        
//        return null;
//        
//    }
//
//    public boolean update(String fileName, String criterion, String neweData) {
//        
//        return false;
//        
//    }
//}
    

