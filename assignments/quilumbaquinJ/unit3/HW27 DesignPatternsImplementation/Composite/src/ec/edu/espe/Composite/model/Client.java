
package ec.edu.espe.Composite.model;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Client {
    // This class relates to a specific Employee
    public static Employee employee;
    public static void doClientTasks() {
    // Do work with this employee
    employee.stateName();
}
}
