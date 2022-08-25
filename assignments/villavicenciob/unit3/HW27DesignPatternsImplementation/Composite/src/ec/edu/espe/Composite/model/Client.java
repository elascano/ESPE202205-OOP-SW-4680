
package ec.edu.espe.Composite.model;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class Client {
    // This class relates to a specific Employee
    public static Employee employee;
    public static void doClientTasks() {
    // Do work with this employee
    employee.stateName();
}
}
