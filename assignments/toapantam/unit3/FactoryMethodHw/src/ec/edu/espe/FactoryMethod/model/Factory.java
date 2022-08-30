
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Martín Toapanta, DCCO-ESPE, MyWayCode
 */
public abstract class Factory {
    public Factory() {
    protected abstract connection createConnection(String type);    //Factory method
}

