
package ec.edu.espe.Composite.model;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
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
