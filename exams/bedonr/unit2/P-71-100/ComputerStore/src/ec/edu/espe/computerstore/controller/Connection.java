/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.computerstore.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Roberto Bedon, DCCO- ESPE, BettaCoders
 */
public class Connection {
    public static MongoDatabase mongodb = null;

    public static MongoDatabase connectionDataBase() {

        if (mongodb == null) {
            String uri = "mongodb+srv://alexbg:alexbg@refrigerator.bzwk3hu.mongodb.net/?retryWrites=true&w=majority";
            String db = "computer";

            MongoClient mongoClient = MongoClients.create(uri);

            Connection.mongodb = mongoClient.getDatabase(db);
        }

        return Connection.mongodb;

    }
}
