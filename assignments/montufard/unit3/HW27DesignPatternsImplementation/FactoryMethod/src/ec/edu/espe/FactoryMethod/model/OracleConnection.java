
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.MS
 */
public class OracleConnection extends Connection {
    public OracleConnection() {
    }
    public String description() {
        return "Oracle";
    }
}
