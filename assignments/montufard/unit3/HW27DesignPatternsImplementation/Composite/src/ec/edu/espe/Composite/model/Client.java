
package ec.edu.espe.Composite.model;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.MS
 */
public class Client {
    // This class relates to a specific Employe
    public static Employe employee;
    public static void doClientTasks() {
    // Do work with this employee
    employee.stateName();
}
}
