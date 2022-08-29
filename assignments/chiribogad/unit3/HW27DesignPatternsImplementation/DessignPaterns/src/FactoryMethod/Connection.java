package FactoryMethod;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public abstract class Connection {

    public abstract Connection() {
    }

    public String description() {
        return “Generic”;
    }
}