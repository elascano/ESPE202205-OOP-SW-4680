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

import com.mongodb.client.MongoDatabase;
import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import org.bson.codecs.configuration.CodecProvider;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
/**
 *
 * @author Carlos Granda, DCCO- ESPE, Syntax Error
 */
public class Conexion {

    
    public static MongoDatabase mongoDB = null;


    public MongoDatabase obtenerConexion() {
        if (Conexion.mongoDB == null) {
            String db = "dbStylesIrelia";
            String uri = "mongodb+srv://admin:admin@cluster0.kp5wq4w.mongodb.net/?retryWrites=true&w=majority";
            MongoClient mongoClient = MongoClients.create(uri);
            Conexion.mongoDB = mongoClient.getDatabase(db);
        }
        return Conexion.mongoDB;

    }

}
