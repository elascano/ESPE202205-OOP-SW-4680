package pruebamongodb;

import com.mongodb.DB;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class PruebaMongoDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        String host = "stylesirelia-shard-00-00.by7pr.mongodb.net:27017";
        
        
        String db = "dbStylesIrelia";
        String collectionCusomers="customers";
        String uri = "mongodb+srv://Carlos_Rivera:<password>@movie.h4wfz3l.mongodb.net/test";
        
        
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            MongoDatabase mongoDB= mongoClient.getDatabase(db);
            MongoCollection mongoCollection = mongoDB.getCollection(collectionCusomers);
            MongoCollection mongoCollectionStylist = mongoDB.getCollection("stylists");
            
            Document doc2 = new Document("Name", "Movies Fan").append("number", "09841900-31").append("Ciudad", "Quito");
            
            mongoCollectionStylist.insertOne(doc2);
            Document doc = new Document("name", "Julian Rivera").append("numer", "0983272037").append("materia", "POO");
            mongoCollection.insertOne(doc);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
