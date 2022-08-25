
package ec.edu.espe.Composite.model;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
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
