
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class MySqlConnection extends Connection {
    public MySqlConnection() {
    }
    public String description() {
        return "MySQL";
    }
    
}
