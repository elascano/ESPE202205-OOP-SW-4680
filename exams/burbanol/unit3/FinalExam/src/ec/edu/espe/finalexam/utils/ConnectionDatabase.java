/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.finalexam.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class ConnectionDatabase {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://admin:adminStylesIrealia@stylesirelia.by7pr.mongodb.net/?retryWrites=true&w=majority";
        String db = "dbStylesIrelia";
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            mongodb = mongoClient.getDatabase(db);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static MongoDatabase getConnection() {
        return mongodb;
    }

}
