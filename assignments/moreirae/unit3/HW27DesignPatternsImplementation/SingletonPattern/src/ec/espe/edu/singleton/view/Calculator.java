
package ec.espe.edu.singleton.view;

import ec.espe.edu.singleton.model.USTax;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Calculator {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        USTax tax2 = USTax.getInstance();
        System.out.println(tax.salesTotal() + "%");
        System.out.println(tax.hashCode());
        System.out.println(tax2.hashCode());
    }
    
}
