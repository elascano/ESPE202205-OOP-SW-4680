
package ec.edu.espe.stylesirelia.controller;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Practica {
    
    public static MongoDatabase database =null;
    
    private Practica(){}
    
    public static MongoDatabase conexionDatabase(){
        String uri = "mongodb+srv://admin:adminStylesIrealia@stylesirelia.by7pr.mongodb.net/?retryWrites=true&w=majority";
        MongoClient connection = MongoClients.create(uri);
        Practica.database = connection.getDatabase("BASEDEPRUEBA");
        return Practica.database;
    }
    
}
