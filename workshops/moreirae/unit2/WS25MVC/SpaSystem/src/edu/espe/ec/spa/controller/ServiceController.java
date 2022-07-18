
package edu.espe.ec.spa.controller;

import edu.espe.ec.spa.model.Service;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class ServiceController {
   /*
    chooseService();
    billService();
    giveDiscount();
    
    
    
    */ 
 
    
    public boolean register(Service service, JFrame frmFrame){
        int reply;
        String message;
        message = service.getType() + " is going to be schedule it to the system";
        JOptionPane.showMessageDialog(frmFrame, message);
        message = "Are you sure you want to register " + service.getType() + " to the system?";
        reply = JOptionPane.showConfirmDialog(frmFrame, message);
        if(reply == JOptionPane.YES_OPTION){
            //code to save service in the database
            
            JOptionPane.showMessageDialog(frmFrame, "Saving...");
        } else {
            JOptionPane.showMessageDialog(frmFrame, "It was not saved", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        
 
  
        //if yes - save to data base
        //else - dont save it
        //code to insert in the database
        
        return true;
    }
}
