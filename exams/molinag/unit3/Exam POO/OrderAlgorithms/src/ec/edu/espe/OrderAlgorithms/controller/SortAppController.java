package ec.edu.espe.OrderAlgorithms.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.OrderAlgorithms.model.SortApp;
import ec.edu.espe.OrderAlgorithms.utils.MongoDateBase;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class SortAppController {
        private MongoDatabase mongoDatabase =  MongoDateBase.mongodb;

    private MongoCollection<Document> mongoCollection;

    public SortAppController(){
        this.mongoCollection = mongoDatabase.getCollection("Algorithms");
    }
    
    public void updateToDatabase(Document document) {
        mongoCollection.insertOne(document);

    }
    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public Document createDocument(SortApp sortApp){
        Document document = new Document();    
        document.append("UnarrangeNumbers", Arrays.toString(sortApp.getUnarrangedNumbers()));
        document.append("sizeOfListOfNumbers", sortApp.getSize());
        document.append("sortAlgorithm", sortApp.getSort());
        document.append("OrderlyNumbers", Arrays.toString(sortApp.getOrderlyNumbers()));
       
        
        return document;
    }

}
