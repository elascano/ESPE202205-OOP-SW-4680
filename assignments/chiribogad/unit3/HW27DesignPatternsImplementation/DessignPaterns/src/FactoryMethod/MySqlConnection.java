package FactoryMethod;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class MySqlConnection extends Connection {
    public MySqlConnection() {
    }
    public String description {
        return “MySQL”; 
    } 
}