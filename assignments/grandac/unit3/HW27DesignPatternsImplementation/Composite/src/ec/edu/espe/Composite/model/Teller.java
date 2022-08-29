
package ec.edu.espe.Composite.model;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class Teller extends Employe {
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
