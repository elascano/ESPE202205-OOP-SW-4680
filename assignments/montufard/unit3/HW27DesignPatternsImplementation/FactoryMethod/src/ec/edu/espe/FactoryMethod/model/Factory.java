
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.MS
 */
public abstract class Factory {
    public Factory() {
    protected abstract connection createConnection(String type);    //Factory method
}
}
