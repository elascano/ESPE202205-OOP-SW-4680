package ec.edu.espe.SortApp.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.SortApp.model.NumbersBase;
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
        this.mongoCollection = mongoDatabase.getCollection("MyAlgorithmData");
    }
    
    public void updateToDatabase(Document document) {
        mongoCollection.insertOne(document);

    }
    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public Document createDocument(NumbersBase listNumbers){
        Document document = new Document();    
        document.append("NumbersDisordered", Arrays.toString(listNumbers.getNumbersDisordered()));
        document.append("sizeNumbers", listNumbers.getSizeNumbers());
        document.append("sortAlgorithm", listNumbers.getSortAlgorithm());
        document.append("NumberOrdered", Arrays.toString(listNumbers.getNumberOrdered()));
       
        
        return document;
    }

}
