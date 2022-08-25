
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class OracleConnection extends Connection {
    public OracleConnection() {
    }
    public String description() {
        return "Oracle";
    }
}
