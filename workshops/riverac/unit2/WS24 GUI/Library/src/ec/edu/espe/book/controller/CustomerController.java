package ec.edu.espe.book.controller;

import ec.edu.espe.book.model.Customer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class CustomerController {
    
   /* register();
    sell();
    assignType();
    computeDescount();
    addToTotalSale();
*/
    public boolean register(Customer customer, JFrame frmFrame){
        String message;
        message = customer.getName() + "is going to be added to the system";
        JOptionPane.showMessageDialog(frmFrame,message); 
        return true;
    }
}
