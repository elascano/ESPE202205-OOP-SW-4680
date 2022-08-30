package FactoryMethod;

/**
 *
 * @author Chavez Genaro, DCCO-ESPE, DAMAGE SE
 */
public abstract class Connection {

    public abstract Connection() {
    }

    public String description() {
        return “Generic”;
    }
}