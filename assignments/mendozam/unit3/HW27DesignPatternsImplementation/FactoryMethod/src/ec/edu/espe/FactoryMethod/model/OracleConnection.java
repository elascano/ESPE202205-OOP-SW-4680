
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MS
 */
public class OracleConnection extends Connection {
    public OracleConnection() {
    }
    public String description() {
        return "Oracle";
    }
}
