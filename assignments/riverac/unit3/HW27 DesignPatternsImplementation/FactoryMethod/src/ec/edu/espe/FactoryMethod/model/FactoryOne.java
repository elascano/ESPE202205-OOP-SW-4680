
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
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
