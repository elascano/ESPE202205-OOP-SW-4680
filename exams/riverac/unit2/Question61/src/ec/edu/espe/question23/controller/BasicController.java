package ec.edu.espe.question23.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.ReplaceOptions;
import org.bson.Document;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
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
