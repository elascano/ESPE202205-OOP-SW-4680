package ec.edu.espe.fruitApp.controller;

import ec.edu.espe.fruitApp.model.Vegetable;
import ec.edu.espe.FruitApp.view.FrmVegetable;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Granda,Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class VegetableController {

    public boolean register(Vegetable vegetable, FrmVegetable aThis) {
        String message;
        message = vegetable.getName()+"is going to be added to the database";
        JOptionPane.showMessageDialog(aThis, message);
        message ="Are you sure that you want to register"
                +vegetable.getName()+"to the system";
        
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
