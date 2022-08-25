package FactoryMethod;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public abstract class Factory {

    public Factory() {
    protected abstract connection createConnection(String type); //Factory method
    }

}

public class FactoryOne extends Factory {

    publice connection

    createConnection(String type) { //Factory method
        if (type.equals(“Oracle”))
            return new OracleConnection();
        else
            return new MySqlConnection();
    }
}
