package Desingpatterns.singleton;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
class calculator {

    public static void main(String args[]) {
        USTax tax = USTax.getInstance();
        tax.salesTotal();
    }
}
