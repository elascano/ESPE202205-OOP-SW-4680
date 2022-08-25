/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.keyboard.controller;

import javax.swing.text.Document;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class KeyboardController {
    
     public boolean create(String table, Document record) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {

            MongoDatabase database = mongoClient.getDatabase("dbsistema");



            MongoCollection < Document > collection = database.getCollection("Shoes3");
          
            
            collection.insertOne(record);
            return false;
         }
     
    }
}
