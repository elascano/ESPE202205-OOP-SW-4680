
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class MySqlConnection extends Connection {
    public MySqlConnection() {
    }
    public String description() {
        return "MySQL";
    }
    
}
