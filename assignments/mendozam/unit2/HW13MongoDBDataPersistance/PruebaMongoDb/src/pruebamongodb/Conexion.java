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
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class Conexion {

    
    public static MongoDatabase mongoDB = null;


    public MongoDatabase obtenerConexion() {
        if (Conexion.mongoDB == null) {
            String db = "Pen";
            String uri = "mongodb+srv://Matt:<clave100>@pen.rcs1q.mongodb.net/?retryWrites=true&w=majority";
            MongoClient mongoClient = MongoClients.create(uri);
            Conexion.mongoDB = mongoClient.getDatabase(db);
        }
        return Conexion.mongoDB;

    }

}
