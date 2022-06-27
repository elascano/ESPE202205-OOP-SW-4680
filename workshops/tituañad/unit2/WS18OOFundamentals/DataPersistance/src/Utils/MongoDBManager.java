package Utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class MongoDBManager extends NoSqlManager{

    @Override
    public void create() {
    
    }

    @Override
    public void read() {
    
    }

    @Override
    public void update() {
    
    }

    @Override
    public void delete() {
    
    }

    @Override
    public void insert() {
    
    }

    public MongoClient Connection(){
        String uri="mongodb+srv://dltituana1:dltituana1@cluster0.il40qoh.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI clientURI;
        MongoClient mongoClient;
        
        clientURI= new MongoClientURI(uri);
        mongoClient = new MongoClient(clientURI);

        
        System.out.println("Conexion Exitosa");
        return mongoClient;
        //mongoClient.getDatabase(uri).forEach(System.out::println);
    }
}

    

