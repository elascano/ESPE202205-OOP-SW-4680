
package exam1;

import ec.edu.espe.forniture.controller.FornitureController;
import ec.edu.espe.forniture.controller.ConnectionDatabase;
import ec.edu.espe.forniture.model.Forniture;
import org.bson.Document;

/**
 *
 * @author Widinson Caiza,  DCCO- ESPE, BettaCoders
 */
public class Exam1 {

    public static void main(String[] args) {
        ConnectionDatabase c = new ConnectionDatabase();
        c.connectDatabase();
        
        Forniture forn1 = new Forniture(0, "sofas", "read", 0, 0);
        Forniture forn2 = new Forniture(0, "destoks", "greeen", 0, 0);
        Forniture forn3 = new Forniture(0, "table", "blue", 0, 0);
        
        FornitureController  fornitureController = new FornitureController("fornitures");
        
        
        

    }
    
}
