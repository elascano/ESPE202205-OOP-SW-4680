package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam.model.Numbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class NumbersController {

    public boolean register(Numbers number) {

        MongoClient mongoClient = MongoClients.create("mongodb+srv://admin00:adminp00@bakerydb.q3bylhk.mongodb.net/?retryWrites=true&w=majority");
        MongoDatabase db = mongoClient.getDatabase("Pointofsaledata");
        
        Document doc = new Document();
        doc.append("unsorted", Arrays.toString(number.getUnsorted()))
                .append("size", number.getSize())
                .append("sortAlgorithm", number.getSortAlgorithm())
                .append("sorted", Arrays.toString(number.getSorted()));
        MongoCollection<Document> collection = db.getCollection("numbers");
        collection.insertOne(doc);

        return true;
    }
}
