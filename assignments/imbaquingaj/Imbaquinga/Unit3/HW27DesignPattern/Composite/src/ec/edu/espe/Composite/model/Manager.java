
package ec.edu.espe.Composite.model;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
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
