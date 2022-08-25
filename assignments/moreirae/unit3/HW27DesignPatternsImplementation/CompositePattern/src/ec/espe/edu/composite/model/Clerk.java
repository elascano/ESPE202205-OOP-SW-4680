
package ec.espe.edu.composite.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Clerk extends Employee{
    public Clerk(String aName) {
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
