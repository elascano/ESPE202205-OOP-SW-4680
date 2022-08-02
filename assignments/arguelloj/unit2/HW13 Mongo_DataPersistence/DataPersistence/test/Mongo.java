

import utils.MongoDBManager;


/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Mongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MongoDBManager mongoDBManager;
        
        mongoDBManager = new MongoDBManager();
        mongoDBManager.conectionMongo();
        mongoDBManager.write();
        mongoDBManager.read();
        mongoDBManager.update();
        
        
    }
    
}
