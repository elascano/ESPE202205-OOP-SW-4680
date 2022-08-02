package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.ReplaceOptions;
import com.mongodb.client.model.UpdateOptions;
import ec.edu.espe.exam.model.CellPhone;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class BasicController {

    private MongoCollection<Document> mongoCollection;

    public BasicController(String mongoCollection) {

        this.mongoCollection = ConnectionDatabase.database.getCollection(mongoCollection);
    }

    public void createToDatabase(Document document) {

        mongoCollection.insertOne(document);
    }

    public Document readToDatabase(String key, String value) {

        return mongoCollection.find(eq(key, value)).first();

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
