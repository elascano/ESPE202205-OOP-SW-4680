package mongocrud;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import org.bson.Document;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class TablesCrud {
    
    private MongoDatabase mongodb = Connection.mongodb; 
    private String collectionTables = "tables";
    private MongoCollection<Document> mongoCollection = mongodb.getCollection(collectionTables);
    
    
    public void createTable(Table table){
        
        mongoCollection.insertOne(table.buildDocumentTable());
    }
    
    public void readTable(){
        FindIterable<Document> tables = mongoCollection.find();
        
        for(Document table : tables){
            System.out.println(table);
        }
    }
    
    public void updateTable(){
        mongoCollection.updateOne(eq("name", "pino"),set("name", "acacia"));
    }
    
    public void deleteTable(){
        mongoCollection.deleteOne(eq("name", "cerezo"));
    }
}
