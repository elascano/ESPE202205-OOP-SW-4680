package ec.edu.espe.SortApp.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.SortApp.model.Numbers;
import ec.edu.espe.SortApp.utils.MongoDB;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Carlos Rivera, Juan Quimbiulco DCCO-ESPE, CODEX++
 */
public class NumbersController {

    private MongoDatabase mongoDatabase = MongoDB.mongodb;

    private MongoCollection<Document> mongoCollection;

    public NumbersController(){
        this.mongoCollection = mongoDatabase.getCollection("Algorithms");
    }
    
    public void updateToDatabase(Document document) {
        mongoCollection.insertOne(document);

    }
    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public Document createDocument(Numbers listNumbers){
        Document document = new Document();    
        document.append("Unsorted", Arrays.toString(listNumbers.getUnsorted()));
        document.append("Size", listNumbers.getSize());
        document.append("Algorithm", listNumbers.getAlgorithm());
        document.append("Sort List", Arrays.toString(listNumbers.getSorted()));
       
        
        return document;
    }

}
