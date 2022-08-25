
package ec.espe.edu.composite.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Teller extends Employee {
    
    public Teller( String aName ) {
    this();
    name = aName;
    }

    public void stateName() {
    super.stateName();
    }

    public Teller() {
    title = "Teller";
    }
    
}
