
package ec.edu.espe.Composite.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class President extends Supervisor {
    private static President president = new President();
    private President( String aName ) {
        this();
        name = aName;
    }
    private President( ) {
        super();
        title = "President";
    }
    public void stateName() {
    // Do processing special to presidential naming
        super.stateName();
    }
    public static President getPresident( String aName ) {
        president.name = aName;
        return President.president;
    }
}