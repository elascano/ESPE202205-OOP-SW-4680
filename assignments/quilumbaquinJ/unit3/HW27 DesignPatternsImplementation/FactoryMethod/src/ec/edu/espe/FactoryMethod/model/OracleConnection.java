
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class OracleConnection extends Connection {
    public OracleConnection() {
    }
    public String description() {
        return "Oracle";
    }
}
