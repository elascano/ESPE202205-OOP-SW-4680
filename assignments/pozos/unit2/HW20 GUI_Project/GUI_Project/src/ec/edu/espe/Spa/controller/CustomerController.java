
package ec.edu.espe.Spa.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.Spa.model.MongoDBConnection;
import java.util.Scanner;
import org.bson.Document;


/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class CustomerController {
       public boolean scheduleAppointment() {
        MongoDBConnection mongoDB;
        mongoDB = new MongoDBConnection();
      //  mongoDB.conectionMongo();
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
        Document document;
        Scanner input;
        String addCustomer;
        
        userDB= mongoDB.conectionMongo();
        userdatabase=userDB.getDatabase("LeatherFlowerSystem");
        userCollection= userdatabase.getCollection("Customer");
        
        document=new Document();
        input= new Scanner(System.in);
        
        System.out.println("CUSTOMER");
        System.out.println("Type Full Names:");
        addCustomer= input.next();
        document.append("Full Names",addCustomer);
        
        System.out.println("Type Surnames");
        addCustomer= input.next();
        document.append("Surnames",addCustomer);
        
        System.out.println("Type Cellphone");
        addCustomer= input.next();
        document.append("Cellphone",addCustomer);
        
        System.out.println("Type ID");
        addCustomer= input.next();
        document.append("ID",addCustomer);
        
        System.out.println("Type Email");
        addCustomer= input.next();
        document.append("Email",addCustomer);
        userCollection.insertOne(document);
       return true;
    }
    public void deferAppointment(){
        
    }
    public void calcelAppointment(){
        
    }
    
}
