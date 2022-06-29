
import utils.MongoDBManager;


/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class MongoDBM {
    public static void main(String[] args) {
        MongoDBManager dbManager;
      
    dbManager = new MongoDBManager();
    dbManager.Connection();
    //dbManager.create();
    //dbManager.update();
    dbManager.read();
    //dbManager.delete();
    
   }
}
