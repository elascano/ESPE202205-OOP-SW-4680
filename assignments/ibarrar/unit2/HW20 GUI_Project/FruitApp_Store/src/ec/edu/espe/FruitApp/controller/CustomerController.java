package ec.edu.espe.fruitApp.controller;

import ec.edu.espe.fruitApp.model.Customer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class CustomerController {
/*   
    register();
    sell();
    assingType();
    computeDiscount();
    addSale();
*/
    public boolean register(Customer customer, JFrame frmFrame){
        
        String message;
        message = customer.getFullName()+"is going to be added to the database";
        JOptionPane.showMessageDialog(frmFrame, message);
        message ="Are you sure that you want to register"
                +customer.getFullName()+"to the system";
        
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
