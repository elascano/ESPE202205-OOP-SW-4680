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
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Conexion {

    
    String user="admin";
    String password= "adminStylesIrealia";
    String db="dbStylesIrelia";
    String host="stylesirelia-shard-00-00.by7pr.mongodb.net:27017";
    
    
    static String uri = "mongodb+srv://admin:adminStylesIrealia@stylesirelia.by7pr.mongodb.net/?retryWrites=true&w=majority";

    public static void crearConexion() {


    }

    public static void insertCustomer() {

       

    }

}
