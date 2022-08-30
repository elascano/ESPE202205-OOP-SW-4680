
package ec.edu.espe.Composite.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
        System.out.println( title + " " + name );
    }
}
