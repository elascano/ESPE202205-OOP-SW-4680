package espe.edu.ec.model;

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
 * @author David Montufar, DCCO- ESPE, GADC.MSI
 */
public class Conexion {

    
    String user="DavidAriel";
    String password= "Vengadores22";
    String db="Car";
    
    
    
    static String uri = "mongodb+srv://DavidAriel:Vengadores22@mongodbhw13.s235z.mongodb.net/test";

    public static void crearConexion() {


    }

    public static void insertCustomer() {

       

    }

}
