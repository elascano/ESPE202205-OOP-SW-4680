/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebamongodb;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.UpdateResult;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class CrudBook {

    private MongoDatabase mongoDB = Conexion.mongoDB;
    private String collectionBooks = "books";
    private MongoCollection <Document>mongoCollection = mongoDB.getCollection(collectionBooks);

    public void crearLibro(Book book) {
        
        mongoCollection.insertOne(book.buildDocument());
    }

    public void listarLibros() {

        FindIterable<Document> books = mongoCollection.find();
        for (Document book : books) {
            System.out.println("libro=" + book.get("title"));
        }

    }
    
    public void updateLibro(){
        UpdateResult book = mongoCollection.updateOne(eq("title", "Mero mia mor"),combine(set("title", "mero Actualizado")));
        System.out.println(book);
    }
    
    public void deleteLibro(){
        mongoCollection.deleteOne(eq("title", "mero Actualizado"));
    }

}
