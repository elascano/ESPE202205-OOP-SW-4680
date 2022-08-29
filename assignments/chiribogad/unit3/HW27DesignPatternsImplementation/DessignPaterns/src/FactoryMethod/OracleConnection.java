package FactoryMethod;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class OracleConnection extends Connection {
    public OrcleConnection(){
    }
    
    public String description {
        return “Oracle”; 
    }
}