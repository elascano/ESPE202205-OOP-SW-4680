
package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class MongoDBManager extends NoSqlManager{
    @Override
    public void insert() {
    }
    String collection;
        public  MongoClient Connection(){
            String uri= "mongodb+srv://Josue_Villavicencio:JosueVilla@cluster0.cedaxqv.mongodb.net/?retryWrites=true&w=majority";
     MongoClientURI clientURI;
     MongoClient client;
        
     
    
        clientURI= new MongoClientURI(uri);
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
        String dateAirplane;
        
        userDB= Connection();
        userdatabase=userDB.getDatabase("Ariplane");
        userCollection= userdatabase.getCollection("color");
        
        document=new Document();
        input= new Scanner(System.in);
        
        System.out.println("Airplane");
        System.out.println("type Airplane name");
        dateAirplane= input.next();
        document.append("Airplane",dateAirplane);
        
        System.out.println("type Ariplane form");
        dateAirplane= input.next();
        document.append("Form",dateAirplane);
        
        System.out.println("type airplane tipe");
        dateAirplane= input.next();
        document.append("Tipe",dateAirplane);
        
        System.out.println("type airplane distance");
        dateAirplane= input.next();
        document.append("Distance",dateAirplane);
        
        System.out.println("type airplane size");
        dateAirplane = input.next();
        document.append("Size",dateAirplane);
        userCollection.insertOne(document);
       return true;
    }
//       
//   
//      
//    public ArrayList<String> read(String fileName) {
//        
// 
//        return jsonData;
//        
//    }
//    public boolean delete(String fileName, String criterion) {
//        
//        retunr return false;
//        
//    }
//        
//    public ArrayList<String> find(String fileName, String criterion) {
//        
//        return null;
//    }
//
//  
//    public boolean update(String fileName, String criterion, String newData) {
//        
//      return false; 
//    }
//
//    @Override
//    public void insert() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//        
//    }
//    
}
