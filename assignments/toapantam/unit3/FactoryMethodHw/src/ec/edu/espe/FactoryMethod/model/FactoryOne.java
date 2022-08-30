
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Martín Toapanta, DCCO-ESPE, MyWayCode
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
