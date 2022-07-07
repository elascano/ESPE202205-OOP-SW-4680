
package mongotrials;

import java.util.Arrays;
import org.bson.Document;
import org.bson.types.ObjectId;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class MongoTrials {
    public static void main(String[] args) {
        String uri = "mongodb+srv://admin00:admin00p@mongotrial.rcr70qw.mongodb.net/test";
        String db = "vegetables";
        String collectionV = "vegetable";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase(db);
            MongoCollection collV = database.getCollection(collectionV);
            
            Document document;
            document = new Document("color","green").append("type","brocoli");
            InsertOneResult result;
            result = collV.insertOne(document);
        
        }catch(Exception e){
            
        }
        
    }
    
}
