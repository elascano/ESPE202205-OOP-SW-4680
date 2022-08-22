
package calculatorandustax;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class CalculatorandUSTax {

    public static void main(String[] args) {
    USTax tax = USTax.getInstance();
    System.out.println(tax.salesTotal(12.3));
    }

}
