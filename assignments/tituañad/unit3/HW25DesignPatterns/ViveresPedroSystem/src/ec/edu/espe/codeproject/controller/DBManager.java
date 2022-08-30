package ec.edu.espe.codeproject.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class DBManager {

    static MongoDatabase database = null;

    public static MongoDatabase getDatabase() {
        if (database == null) {
            String uri = "mongodb+srv://dltituana1:dltituana1@cluster0.il40qoh.mongodb.net/?retryWrites=true&w=majority";

            MongoClient mongoClient = MongoClients.create(uri);

            database = mongoClient.getDatabase("Proyect");
        }
        return database;
    }}
    

  
