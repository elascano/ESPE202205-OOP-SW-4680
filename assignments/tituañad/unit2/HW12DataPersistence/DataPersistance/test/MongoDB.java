
import Utils.MongoDBManager;


public class MongoDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MongoDBManager dbManager;
      
    dbManager = new MongoDBManager();
    dbManager.Connection();
    //dbManager.create();
    dbManager.read();
    //dbManager.update();
    //dbManager.delete();


    }
    
    }
    

