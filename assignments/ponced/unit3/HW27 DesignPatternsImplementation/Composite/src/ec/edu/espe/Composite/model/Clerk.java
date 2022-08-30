
package ec.edu.espe.Composite.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class Clerk extends Employee {
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
