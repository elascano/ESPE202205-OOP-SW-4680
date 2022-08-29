
package ec.edu.espe.Composite.model;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.MS
 */
abstract class Employe {
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
        System.out.println( title + " " + name );
    }
}
