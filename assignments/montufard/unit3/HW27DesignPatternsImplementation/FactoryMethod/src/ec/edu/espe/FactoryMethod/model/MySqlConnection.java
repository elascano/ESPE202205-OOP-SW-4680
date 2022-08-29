
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.MS
 */
public class MySqlConnection extends Connection {
    public MySqlConnection() {
    }
    public String description() {
        return "MySQL";
    }
    
}
