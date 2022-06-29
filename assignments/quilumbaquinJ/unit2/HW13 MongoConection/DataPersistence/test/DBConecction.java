
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class DBConecction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String uri="mongodb+srv://jairo:jairo@jqdatabase.0xyetay.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI clientURI;
        MongoClient client;
        
     
    
            clientURI= new MongoClientURI(uri);
            client = new MongoClient(clientURI);

        
            System.out.println("Conexion Exitosa");
    }
    
}
