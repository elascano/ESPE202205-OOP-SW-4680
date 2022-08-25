
package ec.edu.espe.Composite.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
        System.out.println( title + " " + name );
    }
}
