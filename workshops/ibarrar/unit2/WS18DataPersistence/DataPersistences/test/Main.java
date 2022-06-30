import utils.MongoDBManager;



/**
 *
 * @author Ronny Ibarra, DCCO ESPE, Syntax Error
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       MongoDBManager mongoDBManager;
        
        mongoDBManager = new MongoDBManager();
        mongoDBManager.MongoConnection();
        mongoDBManager.write();
        mongoDBManager.read();
   
    }

}
