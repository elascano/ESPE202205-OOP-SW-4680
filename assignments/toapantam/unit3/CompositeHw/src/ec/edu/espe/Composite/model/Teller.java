
package ec.edu.espe.Composite.model;

/**
 *
 * @author Martín Toapanta, DCCO-ESPE, MyWayCode
 */
public class Teller extends Employee {
    public Teller( String aName ) {
        this();
        aName = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Teller() {
        title = "Teller";
    }
}
