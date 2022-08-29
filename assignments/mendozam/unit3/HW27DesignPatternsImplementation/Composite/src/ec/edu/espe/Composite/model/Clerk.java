
package ec.edu.espe.Composite.model;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MS
 */
public class Clerk extends Employe {
    public Clerk( String aName ) {
        this();
        name = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Clerk() {
        title = "Clerk";
    }
}
