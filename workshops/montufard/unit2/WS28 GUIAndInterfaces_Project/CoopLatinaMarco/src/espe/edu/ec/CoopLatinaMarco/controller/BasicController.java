
package espe.edu.ec.CoopLatinaMarco.controller;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import espe.edu.ec.CoopLatinaMarco.model.BasicModel;
import espe.edu.ec.CoopLatinaMarco.model.Connection;
import org.bson.Document;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class BasicController<T extends BasicModel> {
    T model;
    private MongoDatabase mongoDB = Connection.mongodb;

    private MongoCollection<Document> mongoCollection;

    public BasicController(T object, String collectionName) {
        this.model = object;
        this.mongoCollection = mongoDB.getCollection(collectionName);
    }

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }
  
    public void create() {

        Document document = model.buildDocument();

        mongoCollection.insertOne(document);

    }
    
    public FindIterable<Document> read(String id) {

        return mongoCollection.find(eq(id));
    }
    
    public void delete(String id, Object idValue) {
        mongoCollection.deleteOne(eq(id, idValue));

    }
    
    public void updateModel(T model) {
        this.model = model;
    }
    
     public void update(String id, String idValue, String updateKey, String valueUpdate) {

        getMongoCollection().updateOne(eq(id, idValue), set(updateKey, valueUpdate));

    }
}
