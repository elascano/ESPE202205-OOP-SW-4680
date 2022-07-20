package ec.edu.espe.FruitApp.controller;

import ec.edu.espe.fruitApp.model.Fruit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class FruitController {
    
    public boolean ADD(Fruit fruit, JFrame frmFrame){
        
        String message;
        message = fruit.getName()+"is going to be added to the database";
        JOptionPane.showMessageDialog(frmFrame, message);
        message ="Are you sure that you want to Add"
                +fruit.getName()+"to the system";
        
        int reply = JOptionPane.showConfirmDialog(frmFrame, message);
        if (reply== JOptionPane.YES_OPTION){
            JOptionPane.showConfirmDialog(frmFrame,"Saving");
        }else{
            JOptionPane.showConfirmDialog(frmFrame,"it was not saved", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        //code to insert in the database
        return true;
    }
    
}
