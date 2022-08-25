
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class FactoryOne extends Factory {

    @Override
    protected Object createConnection(String type) {
        if (type.equals("Oracle")){
        return new OracleConnection();
        }
        else{
        return new MySqlConnection();
        }
    }
    
}
