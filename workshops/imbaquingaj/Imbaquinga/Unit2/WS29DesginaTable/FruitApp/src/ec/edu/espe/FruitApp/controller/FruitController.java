package ec.edu.espe.fruitApp.controller;

import ec.edu.espe.fruitApp.model.Fruit;
import ec.edu.espe.FruitApp.view.FrmFruit;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Granda,Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class FruitController {

    public boolean register(Fruit fruit, FrmFruit aThis) {
        String message;
        message = fruit.getName()+"is going to be added to the database";
        JOptionPane.showMessageDialog(aThis, message);
        message ="Are you sure that you want to register"
                +fruit.getName()+"to the system";
        
        int reply = JOptionPane.showConfirmDialog(aThis, message);
        if (reply== JOptionPane.YES_OPTION){
            JOptionPane.showConfirmDialog(aThis,"Saving");
        }else{
            JOptionPane.showConfirmDialog(aThis,"it was not saved", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        //code to insert in the database
        return true;
    }
    
}
