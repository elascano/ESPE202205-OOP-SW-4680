package Desingpatterns.factorymethod;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class OracleConnection extends Connection {

    public OracleConnection() {

    }

    public String description() {

        return "Oracle";
    }
}
