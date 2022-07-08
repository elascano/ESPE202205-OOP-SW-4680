package ec.edu.espe.store.controler;

import ec.edu.espe.store.model.ServicesDate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class ServiceDateController {
    public boolean addToOptionDate(JFrame jFrame, ServicesDate servicesDate){
        if(servicesDate.getDate().equals("")){
            return false;
        }
        else {
            JOptionPane.showMessageDialog(jFrame, servicesDate.optionDate);
            return true;
            }
    }
    
}
