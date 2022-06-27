
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import utils.MongoDBManager;



/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class Main {
   public static void main(String[] args) {
        MongoDBManager mongoDBManager;
        
        mongoDBManager = new MongoDBManager();
        mongoDBManager.Connection();
        mongoDBManager.write();
       // mongoDBManager.read();
       //mongoDBManager.update();
        
        
    }
}