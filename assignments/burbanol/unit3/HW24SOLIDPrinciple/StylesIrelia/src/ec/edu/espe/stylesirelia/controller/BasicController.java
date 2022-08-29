package ec.edu.espe.stylesirelia.controller;

import com.google.gson.Gson;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.ReplaceOptions;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.stylesirelia.model.Stylist;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class BasicController<T> extends BasicModel {

    T model;
    private MongoDatabase mongoDB = Connection.mongodb;

    private MongoCollection<Document> mongoCollection;

    public BasicController(T object, String collectionName) {
        this.model = object;
        this.mongoCollection = mongoDB.getCollection(collectionName);
    }

    public T parseDocumentToClass(Document document) {

        Gson gson = new Gson();
        return (T) gson.fromJson(document.toJson(), model.getClass());

    }

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    @Override
    public void create(Document document) {
        mongoCollection.insertOne(document);

    }

    @Override
    public Document read(String idFind,String valueFind) {
        
        return mongoCollection.find(eq(valueFind,idFind)).first();
    }
    @Override
    public Document read(Document document) {
         
        return mongoCollection.find(document).first();
    }

    @Override
    public DeleteResult delete(String id, Object idValue) {
        return mongoCollection.deleteOne(eq(id, idValue));

    }

    @Override
    public void update(String id, String idValue, String updateKey, String valueUpdate) {

        getMongoCollection().updateOne(eq(id, idValue), set(updateKey, valueUpdate));

    }

    @Override
    public void update(Document query, Document upload) {
        ReplaceOptions options = new ReplaceOptions().upsert(true);

        mongoCollection.replaceOne(query, upload, options);
    }

}
