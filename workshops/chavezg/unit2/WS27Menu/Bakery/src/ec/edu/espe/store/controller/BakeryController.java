package ec.edu.espe.store.controller;

import ec.edu.espe.store.model.Bread;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class BakeryController {

    public boolean register(Bread bread, JFrame frmFrame) {
        int reply;
        String message;
        message = bread.getName() + "is going to be added to the system";
        JOptionPane.showMessageDialog(frmFrame, message);
        
        message = "Are you sure that yu wantto register" + bread.getName() + "to the system?";
        
        reply = JOptionPane.showConfirmDialog(frmFrame, message);
        if(reply ==JOptionPane.YES_OPTION){
        
            JOptionPane.showConfirmDialog(frmFrame, "saving", "OK",JOptionPane.OK_OPTION);
        }else {
            JOptionPane.showMessageDialog(frmFrame, "it was not saved", "WARNING", JOptionPane.ERROR_MESSAGE);
        }
        
        return true;

    }
}
