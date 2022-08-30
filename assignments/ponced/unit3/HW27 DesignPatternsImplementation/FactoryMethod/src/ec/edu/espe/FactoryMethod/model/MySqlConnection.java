
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class MySqlConnection extends Connection {
    public MySqlConnection() {
    }
    public String description() {
        return "MySQL";
    }
    
}
