/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.google.gson.*;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoCommandException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.UserData;
import utils.CsvManager;
import utils.FileManager;
import java.io.*;
import java.util.Collection;
import java.lang.reflect.Type;
import org.bson.Document;
import utils.JsonManager;



/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class Test {

    public static void main (String[] args) throws IOException{
    //Book book = new Book(..);
 
       FileManager fileManager;
       String fileName="volcado2";
    
    fileManager = new JsonManager(fileName);
     
   
         ArrayList<UserData> usuarios = new ArrayList<>();
         
        for (int i = 0; i < 150; i++) {
            UserData usuer = new UserData();
            int entero = i % 13;
            usuer.setName("Beatriz: " + entero);
            
            usuer.setAmount("Amount " + i);
            usuer.setActive((i % 7) == 3);
            usuer.setStartDate(new Date());
            usuarios.add(usuer);
        }
        
      JsonManager jsonManager;
      jsonManager = new JsonManager(fileName);
      
      jsonManager.write2(fileName, usuarios);
              
              
                
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
 
        Writer writer = new FileWriter("volcado.json");
        writer.write(gson.toJson(usuarios));
        writer.close();
 
        Reader reader = new FileReader("volcado.json");
        Type type = new TypeToken<Collection<UserData>>() {
        }.getType();
        ArrayList<UserData> result = gson.fromJson(reader, type);
        System.out.println("Elementos recuperados " + result.size())  ;

       // result.forEach(System.out::println);
       
      
          try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {

            MongoDatabase database = mongoClient.getDatabase("dbsistema");

            System.out.println("database name -> " + database.getName());

            for (String name: database.listCollectionNames()) {

                System.out.println(name);
            }
            
             try {
                database.createCollection("users");
                System.out.println("Collection created successfully");
            } catch (MongoCommandException e) {
                database.getCollection("users").drop();
            }

         /*   ArrayList<Document> docs = new ArrayList < Document > ();

            MongoCollection < Document > collection = database.getCollection("users");

            Document d1 = new Document("_id", 1);
            d1.append("_firstName", "Ramesh");
            d1.append("_lastName", "Fadatare");
            docs.add(d1);

            Document d2 = new Document("_id", 2);
            d2.append("_firstName", "Tony");
            d2.append("_lastName", "Stark");
            docs.add(d2);

            Document d3 = new Document("_id", 3);
            d3.append("_firstName", "Tom");
            d3.append("_lastName", "Cruise");
            docs.add(d3);

            Document d4 = new Document("_id", 4);
            d4.append("_firstName", "Amir");
            d4.append("_lastName", "Khan");
            docs.add(d4);

            Document d5 = new Document("_id", 5);
            d5.append("_firstName", "Umesh");
            d5.append("_lastName", "Fadatare");
            docs.add(d5);

            collection.insertMany(docs);
        }*/
        ArrayList<Document> docs = new ArrayList < Document > ();

            MongoCollection < Document > collection = database.getCollection("Shoes3");

            Document d1 = new Document("_id", 1);
            d1.append("name", "Grand Court");
            d1.append("Brand", "Adidas");
            d1.append("Year", "2020");
            docs.add(d1);

            Document d2 = new Document("_id", 2);
            d2.append("name", "Air Force 1");
            d2.append("Brand", "Nike");
            d2.append("Year", "1990");
            docs.add(d2);

            Document d3 = new Document("_id", 3);
            d3.append("name", "Mevlzz");
            d3.append("Brand", "Nike");
            d3.append("Year", "2020");
            docs.add(d3);

            Document d4 = new Document("_id", 4);
            d4.append("name", "Air Jordan 11");
            d4.append("Brand", "Jordan");
            d4.append("Year", "2011");
            docs.add(d4);

            Document d5 = new Document("_id", 5);
            d5.append("name", "Santiro");
            d5.append("Brand", "Balenciaga");
            d5.append("Year", "2020");
            docs.add(d5);

            collection.insertMany(docs);
        }
        

   }
}


