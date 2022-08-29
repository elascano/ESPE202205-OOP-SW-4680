
package ec.edu.espe.Composite.model;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
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
