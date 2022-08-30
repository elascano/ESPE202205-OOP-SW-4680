
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public abstract class Factory {
    public Factory() {
    protected abstract connection createConnection(String type);    //Factory method
}

