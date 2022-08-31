package Singleton;

/**
 *
 * @author Chavez Genaro, DCCO-ESPE, DAMAGE SE
 */
class calculator {
    public static void main(String args[ ]) {
        UsTax tax = USTax.getInstance();
        tax.salesTotal();
    }
}
