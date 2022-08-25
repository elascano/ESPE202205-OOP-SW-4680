
package composite;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Clerk extends Employee {

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
