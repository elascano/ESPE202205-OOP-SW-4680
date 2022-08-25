
package ec.edu.espe.Composite.model;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MS
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
