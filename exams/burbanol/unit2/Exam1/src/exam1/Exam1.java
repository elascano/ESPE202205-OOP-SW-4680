
package exam1;

import ec.edu.espe.exam.controller.CellphoneController;
import ec.edu.espe.exam.controller.ConnectionDatabase;
import ec.edu.espe.exam.model.CellPhone;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Exam1 {

    public static void main(String[] args) {
        ConnectionDatabase c = new ConnectionDatabase();
        c.connectDatabase();
        
        CellPhone comp = new CellPhone(1, "g50", "Asus", 32, 300, 400);
        CellPhone comp2 = new CellPhone(2, "g20", "Acer", 32, 300, 400);
        CellPhone comp3 = new CellPhone(3, "g60", "Acer", 32, 300, 600);
        
        CellphoneController  compController = new CellphoneController("computers");
        //compController.createToDatabase(comp.builDocument());
        //compController.createToDatabase(comp2.builDocument());
        Document doc = compController.readToDatabase("model", "g50");
        
        System.out.println(doc.toJson());
        
        //compController.uploadToDatabase(comp3.builDocument(), comp2.builDocument());
        
        //compController.deleteToDatabase(comp2.builDocument());
        
        

    }
    
}
