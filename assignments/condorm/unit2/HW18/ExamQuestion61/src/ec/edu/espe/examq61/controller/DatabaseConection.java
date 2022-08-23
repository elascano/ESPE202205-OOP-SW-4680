/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.examq61.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class DatabaseConection {
    
    public static MongoDatabase database = null;
    public MongoDatabase connectDatabase(){
        
        
        if (database == null) {
            String uri = "mongodb+srv://admin00:adminp00@bakerydb.q3bylhk.mongodb.net/test";
            String db = "exam";

            MongoClient mongoClient = (MongoClient) MongoClients.create(uri);

            DatabaseConection.database = mongoClient.getDatabase(db);
        }
        
        
        return DatabaseConection.database;
    }
}
