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
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 * @author Martín Toapanta, DCCO - ESPE, MyWayCode
 */
public class ConnectionDatabase {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://dltituana1:dltituana1@cluster0.il40qoh.mongodb.net/?retryWrites=true&w=majority";
        String db = "Numeros";
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
