
package composite;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Teller extends Employee{

    public Teller(String aName) {
        this();
        name = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Teller() {
        title = "Teller";
    }
}
