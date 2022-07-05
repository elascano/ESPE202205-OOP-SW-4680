package ec.edu.espe.homework;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoCommandException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.UpdateResult;
import java.io.IOException;
import java.util.Scanner;
import org.bson.conversions.Bson;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class conection {

    public static void main(String args[]) throws IOException, InterruptedException {
     
        MongoClient mongoClient = MongoClients.create("mongodb+srv://joel:Cjoel2019@joel.crhww.mongodb.net/test");
        
        MongoDatabase database = mongoClient.getDatabase("joel");
        
        MongoCollection < Document > collection = database.getCollection("Graphics Cards");
        
        try {
            database.createCollection("Graphics Cards");
            System.out.println("Collection created successfully");
        } catch (MongoCommandException e) {
            database.getCollection("Graphics Cards").drop();
        }
         
        int option;
        int id;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        
        while(!exit){
            
           System.out.println("1. Create");
           System.out.println("2. Read");
           System.out.println("3. Update");
           System.out.println("4. Delete");
           System.out.println("5. Exit");
            
           System.out.println("Write the option");
           option = sc.nextInt();
           System.out.flush();
                   
            switch(option){
               case 1:
                   
                var docs = new ArrayList < Document > ();
                
                System.out.println("Insert the SKU ID: ");
                id = sc.nextInt();
                var d1 = new Document("_id", id);
                System.out.println("Insert the name of the graphic: ");
                String firstName = sc.next();
                System.out.println("First Name: "+firstName);
                d1.append("_firstName", firstName);
                System.out.println("Insert the capacity of the graphic: ");
                String capacity = sc.next();
                System.out.println("GB: "+capacity);
                d1.append("_capacity", capacity);
                docs.add(d1);
                
                System.out.println("Insert the SKU ID: ");
                id = sc.nextInt();
                var d2 = new Document("_id", id);
                System.out.println("Insert the name of the graphic: ");
                firstName = sc.next();
                System.out.println("First Name: "+firstName);
                d2.append("_firstName", firstName);
                System.out.println("Insert the capacity of the graphic: ");
                capacity = sc.next();
                System.out.println("GB: "+capacity);
                d2.append("_capacity", capacity);
                docs.add(d2);
                
                System.out.println("Insert the SKU ID: ");
                id = sc.nextInt();
                var d3 = new Document("_id", id);
                System.out.println("Insert the name of the graphic: ");
                firstName = sc.next();
                System.out.println("First Name: "+firstName);
                d3.append("_firstName", firstName);
                System.out.println("Insert the capacity of the graphic: ");
                capacity = sc.next();
                System.out.println("GB: "+capacity);
                d3.append("_capacity", capacity);
                docs.add(d3);
                
                System.out.println("Insert the SKU ID: ");
                id = sc.nextInt();
                var d4 = new Document("_id", id);
                System.out.println("Insert the name of the graphic: ");
                firstName = sc.next();
                System.out.println("First Name: "+firstName);
                d4.append("_firstName", firstName);
                System.out.println("Insert the capacity of the graphic: ");
                capacity = sc.next();
                System.out.println("GB: "+capacity);
                d4.append("_capacity", capacity);
                docs.add(d4);

                collection.insertMany(docs);
      
                   break;
               case 2:
                   System.out.println("Read");
             
                   try (MongoCursor < Document > cur = collection.find().iterator()) {

                while (cur.hasNext()) {

                    var doc = cur.next();
                    var users = new ArrayList < > (doc.values());

                    System.out.printf("Name: %s: GB: %s\n", users.get(1), users.get(2));
                    }   
                }
                   break;
                case 4:
                    
                    System.out.println("Has seleccionado la opcion 3");
                    System.out.println("Insert the name to delete: ");
                    firstName = sc.next();
                    collection.deleteOne(Filters.eq("_firstName", firstName));
                    System.out.println("Document deleted successfully...");
                       
                break;
                case 3:
                               
                    Bson filter = eq("_id", 1);
                    Bson updateOperation = set("_specification", "Joeasdl");
                    UpdateResult updateResult = collection.updateOne(filter, updateOperation);
                    System.out.println("=> Updating the doc with new specitication.");

                break;
                case 5:
                exit=true;
                break;
                default:
                   System.out.println("Just number 1 to 5 ");}
            }
    }
}