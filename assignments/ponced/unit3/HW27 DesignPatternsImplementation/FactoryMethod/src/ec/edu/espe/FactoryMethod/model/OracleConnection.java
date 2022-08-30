
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class OracleConnection extends Connection {
    public OracleConnection() {
    }
    public String description() {
        return "Oracle";
    }
}
