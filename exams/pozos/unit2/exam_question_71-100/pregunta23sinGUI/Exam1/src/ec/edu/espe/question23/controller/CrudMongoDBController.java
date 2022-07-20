package ec.edu.espe.question23.controller;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.ReplaceOptions;
import com.mongodb.client.model.UpdateOptions;
import ec.edu.espe.question23.model.SmartWatchs;
import org.bson.Document;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class CrudMongoDBController {

    private MongoCollection<Document> mongoCollection;

    public CrudMongoDBController(String mongoCollection) {

        this.mongoCollection = MongoDBConnection.database.getCollection(mongoCollection);
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
