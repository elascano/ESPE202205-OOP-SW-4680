/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sort.controller;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import utils.Connection;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class DbManager {
    
  
    MongoDatabase database;
    MongoCollection sortCollection;
    Document document;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        com.mongodb.MongoClient client;
        MongoDatabase userdatabase;

        String uri = "mongodb://localhost:27017";

        clientURI = new MongoClientURI(uri);
        client = new com.mongodb.MongoClient(clientURI);
        System.out.println("succesfull conection");

        userdatabase = client.getDatabase("Sort");

        return userdatabase;

    }
    
        public void Insert(String v,String size,String typeAlgoritim, String sorted) {

        database = EstablishConnection();
        sortCollection = database.getCollection("ListOfNumbers");

        document = new Document();

        document.append("Unsorted",v);
        document.append("Size", size);
        document.append("Sort algorithm", typeAlgoritim);
        document.append("Sorted", sorted);

        sortCollection.insertOne(document);
        

    }
    
 
}

   
