
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Martín Toapanta, DCCO-ESPE, MyWayCode
 */
public class MySqlConnection extends Connection {
    public MySqlConnection() {
    }
    public String description() {
        return "MySQL";
    }
    
}
