
package ec.edu.espe.Composite.model;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
abstract class Employe {
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
        System.out.println( title + " " + name );
    }
}
