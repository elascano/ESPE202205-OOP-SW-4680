package ec.edu.espe.Exam3P.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.Exam3P.model.ListNumbers;
import ec.edu.espe.Exam3P.utils.ConnectionDatabase;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class ListNumbersController {

    private MongoDatabase mongoDatabase = ConnectionDatabase.mongodb;

    private MongoCollection<Document> mongoCollection;

    public ListNumbersController(){
        this.mongoCollection = mongoDatabase.getCollection("Data");
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
