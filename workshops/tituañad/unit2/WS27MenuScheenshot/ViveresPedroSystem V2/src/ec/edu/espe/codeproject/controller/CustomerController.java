
package ec.edu.espe.codeproject.controller;

import ec.edu.espe.codeproject.model.Customer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class CustomerController {
    public boolean register(Customer customer, JFrame frmFrame) {
        int reply;
        String message;
        message = customer.getName() + " is going to be added to the system";
        JOptionPane.showMessageDialog(frmFrame, message);
        message = customer.getName() + " Are you sure that you want to register "
                + customer.getName() + " to the system?";
        reply = JOptionPane.showConfirmDialog(frmFrame, message);

        if (reply == JOptionPane.YES_OPTION) {
            //code to save the customer in the database
            JOptionPane.showMessageDialog(frmFrame, "saving");
        } else {
            JOptionPane.showMessageDialog(frmFrame, "it was not saved","WARNING",JOptionPane.ERROR_MESSAGE);
        }
        //if yes - save to data base
        //else- don´t save it
        //code to insert in the database
        {
            return true;
        }
    }
}
