
package ec.edu.espe.Composite.model;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
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
