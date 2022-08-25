
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class MySqlConnection extends Connection {
    public MySqlConnection() {
    }
    public String description() {
        return "MySQL";
    }
    
}
