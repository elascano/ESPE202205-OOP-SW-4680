
package ec.edu.espe.Composite.model;

/**
 *
 * @author Martín Toapanta, DCCO-ESPE, MyWayCode
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
