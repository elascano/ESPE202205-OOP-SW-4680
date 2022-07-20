
package exam;

import ec.edu.espe.question.controller.ShoeController;
import ec.edu.espe.question.controller.ConnectionDatabase;
import ec.edu.espe.question.model.Shoe;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class exam {

    public static void main(String[] args) {
        ConnectionDatabase c = new ConnectionDatabase();
        c.connectDatabase();
        
        Shoe sho = new Shoe(124, "Nike", 38, "Black", "Men");
        Shoe sho2 = new Shoe(223, "Adidas", 40, "Blue" , "Woman");
        Shoe sho3 = new Shoe(345, "Rebook", 42, "White" , "Men");
        
        ShoeController  shoController = new ShoeController("shoes");
        //shoController.createToDatabase(sho.buildDocumentShoe());
        //shoController.createToDatabase(sho2.buildDocumentShoe());
        //Document doc = shoController.readToDatabase(comp.buildDocumentShoe());
        
        //System.out.println(doc.toJson());
        
        //shoController.uploadToDatabase(sho3.buildDocumentShoe(), sho2.buildDocumentShoe());
        
        //shoController.deleteToDatabase(sho2.buildDocumentShoes());
        
        

    }
    
}
