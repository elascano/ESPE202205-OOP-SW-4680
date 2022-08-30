
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
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
