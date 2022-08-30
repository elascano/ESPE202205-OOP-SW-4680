
package ec.edu.espe.Composite.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
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
