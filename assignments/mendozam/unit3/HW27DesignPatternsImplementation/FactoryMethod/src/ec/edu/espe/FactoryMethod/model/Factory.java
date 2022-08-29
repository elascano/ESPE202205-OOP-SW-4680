
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MS
 */
public abstract class Factory {
    public Factory() {
    protected abstract connection createConnection(String type);    //Factory method
}
}
