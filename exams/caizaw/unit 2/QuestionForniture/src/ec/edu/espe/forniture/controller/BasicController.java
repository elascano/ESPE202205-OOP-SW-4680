package ec.edu.espe.forniture.controller;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.ReplaceOptions;
import com.mongodb.client.model.UpdateOptions;
import ec.edu.espe.forniture.model.Forniture;
import org.bson.Document;

/**
 *
 * @author 
 */
public class BasicController {

    private MongoCollection<Document> mongoCollection;

    public BasicController(String mongoCollection) {

        this.mongoCollection = ConnectionDatabase.database.getCollection(mongoCollection);
    }

    public void createToDatabase(Document document) {

        mongoCollection.insertOne(document);
    }

    public Document readToDatabase(Document document) {

        return mongoCollection.find(document).first();

    }

    public void uploadToDatabase(Document query, Document upload) {
        ReplaceOptions options = new ReplaceOptions().upsert(true);

        mongoCollection.replaceOne(query, upload, options);
    }

    public void deleteToDatabase(Document document) {
        mongoCollection.deleteOne(document);
    }

    public MongoCollection<Document> getMongoCollection() {
        return mongoCollection;
    }

}
