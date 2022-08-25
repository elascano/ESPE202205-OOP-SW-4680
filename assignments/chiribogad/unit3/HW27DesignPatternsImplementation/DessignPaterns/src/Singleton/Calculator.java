package Singleton;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
class calculator {
    public static void main(String args[ ]) {
        UsTax tax = USTax.getInstance();
        tax.salesTotal();
    }
}
