package ec.edu.espe.SortApp.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.SortApp.model.Numbers;
import ec.edu.espe.SortApp.utils.CDatabase;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class NumbersController {

    private MongoDatabase mongoDatabase = CDatabase.mongodb;

    private MongoCollection<Document> mongoCollection;

    public NumbersController(){
        this.mongoCollection = mongoDatabase.getCollection("Algorithm");
    }
    
    public void updateToDatabase(Document document) {
        mongoCollection.insertOne(document);

    }
    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public Document createDocument(Numbers listNumbers){
        Document document = new Document();    
        document.append("listOfNumbersDisordered", Arrays.toString(listNumbers.getNumbersDisordered()));
        document.append("sizeOfListOfNumbers", listNumbers.getSizeNumbers());
        document.append("sortAlgorithm", listNumbers.getSortAlgorithm());
        document.append("listOfNumberOrdered", Arrays.toString(listNumbers.getNumberOrdered()));
       
        
        return document;
    }

}
