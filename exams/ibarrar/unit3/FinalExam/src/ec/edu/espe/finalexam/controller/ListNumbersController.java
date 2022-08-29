
package ec.edu.espe.finalexam.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.finalexam.model.ListNumbers;
import ec.edu.espe.finalexam.utils.ConnectionDatabase;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Ronny Ibarra, Ricardo Imbaquinga, DCCO- ESPE, Syntax Error
 */
public class ListNumbersController {

    private MongoDatabase mongoDatabase = ConnectionDatabase.mongodb;

    private MongoCollection<Document> mongoCollection;

    public ListNumbersController(){
        this.mongoCollection = mongoDatabase.getCollection("numbers");
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
        document.append("Size", listNumbers.getSize());
        document.append("Sort", listNumbers.getSort());
        document.append("listOfNumberOrdered", Arrays.toString(listNumbers.getListOfNumberOrdered()));
       
        
        return document;
    }

}
