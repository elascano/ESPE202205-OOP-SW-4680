
package ec.espe.edu.composite.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public abstract class Employee {
    
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
    System.out.println( title + " " + name );
    }
    
}
