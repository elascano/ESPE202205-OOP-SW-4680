/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Q1.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.Q1.model.Singer;
import java.util.Iterator;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class MongoDBManager {
    String collection;
    MongoDatabase singerDB;
    MongoCollection singerCollection;
    Document document;

    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        

        String uri = "mongodb+srv://jairo:jairo@jqdatabase.0xyetay.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");

        singerDB = client.getDatabase("JAIRO");

        return singerDB;

    }

    
    public void Create(Singer singer) {

        
        singerDB = EstablishConnection();
        singerCollection = singerDB.getCollection("Singers");

        document = new Document();
        
        document.append("ArtisticName", singer.getArtisticName());
        document.append("Name", singer.getName());
        document.append("Id", singer.getId());
        document.append("Age", singer.getAge());
        document.append("Phone", singer.getPhone());

        singerCollection.insertOne(document);

    }

    
    public void Read() {
        singerDB = EstablishConnection();
        FindIterable<Document> iterDoc;
                
        singerCollection= singerDB.getCollection("Singers");
        iterDoc = singerCollection.find();

        
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    
    public void Update(int updateCriterion, String artisticName,String Name,String age,String phone) {

        Scanner input;
        String upData;

        singerDB = EstablishConnection();
        singerCollection = singerDB.getCollection("Singers");
        
        UpdateValues("ArtisticName",artisticName,updateCriterion);
        UpdateValues("Name",Name,updateCriterion);
        UpdateValues("Age",age,updateCriterion);
        UpdateValues("Phone",phone,updateCriterion);
        
        
    }

    
    public void Delete(int deleteCriterion) {
        
        
        singerDB = EstablishConnection();
        singerCollection = singerDB.getCollection("Singers");
        
        //Deleting a document
        singerCollection.deleteOne(Filters.eq("Id", deleteCriterion));
        
        Read();

    }
    
    
    public void UpdateValues(String value,String updateValue, int updateCriterion ){
    
    Document found = (Document) singerCollection.find(new Document("Id", updateCriterion)).first();
    
    if (found != null) {
    
        Bson updatedValue = new Document(value, updateValue);
        Bson updateOperation = new Document("$set", updatedValue);
        singerCollection.updateOne(found, updateOperation);
        }
    }


}
