
import utils.MongoDBManager;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class mongoDB {
    public static void main(String[] args) {
      MongoDBManager dbManager;
      
    dbManager = new MongoDBManager();
    dbManager.Connection();
    //dbManager.create();
    //dbManager.update();
    //dbManager.read();
    dbManager.delete();
   }
}
