/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singer.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.singer.model.Singer;
import org.bson.Document;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class ExamDB {
    
    String collection;
    MongoDatabase examDB;
    MongoCollection examCollection;
    Document document;
    
    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;
            
        String uri = "mongodb+srv://jdquimbiulco:jdquimbiulco@cluster0.vv6hc.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");

        userdatabase = client.getDatabase("Exam");

        return userdatabase;

    }
    
        public void CreateBook(Singer singer) {

        
        examDB = EstablishConnection();
        examCollection = examDB.getCollection("Singer");

        document = new Document();
        
        document.append("Name",singer.getName());
        document.append("Age",singer.getAge());
        document.append("Music Genre",singer.getMusicGenre());
        document.append("Instruments",singer.getInstruments());


        examCollection.insertOne(document);

    }

    

}
