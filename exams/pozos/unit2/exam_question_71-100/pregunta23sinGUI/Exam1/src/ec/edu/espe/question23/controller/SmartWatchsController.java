
package ec.edu.espe.question23.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.question23.model.SmartWatchs;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 *@author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class SmartWatchsController{
  
    public void SmartWatchs(String brand, String design, String price,String material){
    MongoDBConnection mongoDB;
    mongoDB = new MongoDBConnection();
    MongoClient userDB;
    MongoDatabase userdatabase;
    MongoCollection userCollection;
    Document document;

    userDB= mongoDB.conectionMongo();
    userdatabase=userDB.getDatabase("examOOP");
    userCollection= userdatabase.getCollection("SmartWatchs");

    document=new Document();
        
        document.append("brand",brand);
        document.append("design",design);
        document.append("price",price);
        document.append("material",material);
        
        userCollection.insertOne(document);
        JOptionPane.showMessageDialog(null, "The data has been saved successfully");
        
        
        
    }
    }

    
   
    
    
    

