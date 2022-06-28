package pruebamongodb;

import com.mongodb.DB;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class PruebaMongoDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String host = "stylesirelia-shard-00-00.by7pr.mongodb.net:27017";

        String db = "dbStylesIrelia";
        String collectionCusomers = "customers";
        String uri = "mongodb+srv://admin:adminStylesIrealia@stylesirelia.by7pr.mongodb.net/?retryWrites=true&w=majority";

        try {
            MongoClient mongoClient = MongoClients.create(uri);
            MongoDatabase mongoDB = mongoClient.getDatabase(db);
            MongoCollection mongoCollection = mongoDB.getCollection(collectionCusomers);
            MongoCollection mongoCollectionStylist = mongoDB.getCollection("stylists");

            MongoCollection<Document> collectionCustomersFind = mongoDB.getCollection("customers");

            Document doc2 = new Document("name", "Peluquero William").append("number", "0983272-37").append("Ciudad", "Quito");

            mongoCollectionStylist.insertOne(doc2);
            Document doc = new Document("name", "Jose maria").append("numer", "0983272037").append("materia", "POO");
            mongoCollection.insertOne(doc);

            Document docBusar = collectionCustomersFind.find(eq("name", "Jose maria")).first();
            System.out.println(docBusar.get("name"));

            System.out.println(docBusar.toJson());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
