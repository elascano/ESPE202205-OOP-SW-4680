
package ec.edu.espe.code.view;

import ec.edu.espe.code.model.USTax;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class ClientApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        tax.salesTotal();
    }
    
}
