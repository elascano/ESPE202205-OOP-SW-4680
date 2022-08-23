
package ec.edu.espe.codesports.controller;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class DBManager {
    private static DB database;
    public static DB getDatabase()
    {
        if(database == null)
        {
                String uri= "mongodb+srv://DianaSosa:lPABXCmDAe7NaQSO@clusterobject.jbvkg.mongodb.net";
     MongoClientURI clientURI;
     MongoClient client;
      
    
        clientURI= new MongoClientURI(uri);
        client = new MongoClient(clientURI);
   
            database = client.getDB("sports");
        }
        return database;
    }              
}
