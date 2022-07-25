package exam1;

import ec.edu.espe.question23.controller.FoodController;
import ec.edu.espe.question23.controller.ConnectionDatabase;
import ec.edu.espe.question23.model.Computer;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Exam1 {

    public static void main(String[] args) {
        ConnectionDatabase c = new ConnectionDatabase();
        c.connectDatabase();
        
        Computer comp = new Computer(1, "g50", "Asus", 32, 300, true, 400);
        Computer comp2 = new Computer(2, "g20", "Acer", 32, 300, true, 400);
        Computer comp3 = new Computer(3, "g60", "Acer", 32, 300, true, 600);
        
        FoodController  compController = new FoodController("computers");
        //compController.createToDatabase(comp.buildDocumentComputer());
        //compController.createToDatabase(comp2.buildDocumentComputer());
        //Document doc = compController.readToDatabase("model", "g50");
        
        //System.out.println(doc.toJson());
        
        //compController.uploadToDatabase(comp3.buildDocumentComputer(), comp2.buildDocumentComputer());
        
        //compController.deleteToDatabase(comp2.buildDocumentComputer());
        
        

    }
    
}
