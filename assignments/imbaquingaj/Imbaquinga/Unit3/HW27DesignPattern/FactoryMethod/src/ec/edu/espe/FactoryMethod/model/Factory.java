
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public abstract class Factory {
    public Factory() {
    protected abstract connection createConnection(String type);    //Factory method
}
}
