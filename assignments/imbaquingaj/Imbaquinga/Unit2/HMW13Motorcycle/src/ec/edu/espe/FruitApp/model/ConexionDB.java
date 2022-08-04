/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FruitApp.model;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class ConexionDB {
    
ConnectionString connectionString = new ConnectionString("mongodb://JoseRicardoImbaquingaGuana:josericardo31@ac-sojrx8x-shard-00-00.kp5wq4w.mongodb.net:27017,ac-sojrx8x-shard-00-01.kp5wq4w.mongodb.net:27017,ac-sojrx8x-shard-00-02.kp5wq4w.mongodb.net:27017/?ssl=true&replicaSet=atlas-zp7hgt-shard-0&authSource=admin&retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("MotorcycleDB");
public MongoDatabase GetDB(){
    return database;
}

}
