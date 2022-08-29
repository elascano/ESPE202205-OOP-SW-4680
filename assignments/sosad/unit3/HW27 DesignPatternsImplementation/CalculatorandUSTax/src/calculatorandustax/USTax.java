
package calculatorandustax;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class USTax {

    private static USTax instance;

    private USTax() {
    }

    public static USTax getInstance() {
        if ((instance == null)) {
            instance = new USTax();
        }
        return instance;
    }

    public double salesTotal(double sales) {
        double total;
        total = sales+(sales*0.12);
        return total;
    }
}
