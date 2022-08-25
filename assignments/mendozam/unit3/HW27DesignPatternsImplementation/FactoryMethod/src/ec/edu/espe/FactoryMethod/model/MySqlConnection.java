
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MS
 */
public class MySqlConnection extends Connection {
    public MySqlConnection() {
    }
    public String description() {
        return "MySQL";
    }
    
}
