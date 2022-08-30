package FactoryMethod;

/**
 *
 * @author Chavez Genaro, DCCO-ESPE, DAMAGE SE
 */
public class OracleConnection extends Connection {
    public OrcleConnection(){
    }
    
    public String description {
        return “Oracle”; 
    }
}