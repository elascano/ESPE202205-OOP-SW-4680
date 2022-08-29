package ec.edu.espe.finalexam.controller;

import ec.edu.espe.finalexam.model.ConnectionDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.finalexam.model.ListNumbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class ListNumbersController {

    private MongoDatabase mongoDatabase = ConnectionDatabase.mongodb;

    private MongoCollection<Document> mongoCollection;

    public ListNumbersController(){
        this.mongoCollection = mongoDatabase.getCollection("numberDB");
    }
    
    public void updateToDatabase(Document document) {
        mongoCollection.insertOne(document);

    }
    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public Document createDocument(ListNumbers listNumbers){
        Document document = new Document();    
        document.append("listOfNumbersDisordered", Arrays.toString(listNumbers.getListOfNumbersDisordered()));
        document.append("sizeOfListOfNumbers", listNumbers.getSizeOfListOfNumbers());
        document.append("sortAlgorithm", listNumbers.getSortAlgorithm());
        document.append("listOfNumberOrdered", Arrays.toString(listNumbers.getListOfNumberOrdered()));
       
        
        return document;
    }

}
