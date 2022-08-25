
package ec.espe.edu.composite.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Manager extends Supervisor{
    
    public Manager( String aName ) {
    this();
    name = aName;
    }
    public Manager() {
    super();
    title = "Manager";
    }
    public void stateName() {
    // do processing special to manager naming
    
    super.stateName();
    }
    
}
