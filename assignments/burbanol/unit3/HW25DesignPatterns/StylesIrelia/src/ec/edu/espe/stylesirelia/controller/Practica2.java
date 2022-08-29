/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.stylesirelia.controller;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Practica2 {
    
    public static void main(String[] args) {
        Practica.conexionDatabase();
        
        
        MongoCollection mongoc = Practica.database.getCollection("refrigerator");
        MongoCollection mongoc2 = Practica.database.getCollection("refrigeratorBedon");
           
        Document doc = new Document();
        doc.append("nombre", "Luis");
        doc.append("apellido", "Burbano");
        doc.append("apellido", "Pacheco");
        doc.append("ciudad", "quito");
        
        
        Document doc2 = new Document();
        doc.append("nombre", "Luis");
        doc.append("apellido", "Burbano");
        doc.append("apellido", "Pacheco");
        doc.append("ciudad", "quito");
        
        
        mongoc.insertOne(doc);
        mongoc2.deleteOne(eq("nombre","Luis"));
        mongoc2.replaceOne(eq("nombre","Luis"), doc2);
        
        mongoc2.find(eq("nombre","Luis")).first();
        
    }
    
}
