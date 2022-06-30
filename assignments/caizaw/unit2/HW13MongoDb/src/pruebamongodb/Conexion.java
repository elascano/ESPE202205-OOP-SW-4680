package pruebamongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import static com.mongodb.client.model.Filters.eq;

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
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class Conexion {

    
    String user="danilo";
    String password= "danilo123";
    String db="customer";
    String host="cluster0-shard-00-02.smxif.mongodb.net:27017";
    
    
    static String uri = "mongodb+srv://danilo:danilo123@cluster0.smxif.mongodb.net/test";

    public static void crearConexion() {


    }

    public static void insertCustomer() {

       

    }

}
