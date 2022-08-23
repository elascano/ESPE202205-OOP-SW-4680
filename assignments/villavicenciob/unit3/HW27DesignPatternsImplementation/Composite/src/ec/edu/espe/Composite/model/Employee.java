
package ec.edu.espe.Composite.model;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
        System.out.println( title + " " + name );
    }
}
