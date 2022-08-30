package Desingpatterns.factorymethod;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class FactoryOne extends Factory {

    public Connection createConnection(String type) {
        if (type.equals("Oracle")) {
            return new OracleConnection();
        } else {
            return new MySqlConnection();
        }
    }
}
