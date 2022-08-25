
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public abstract class Factory {
    public Factory() {
    protected abstract connection createConnection(String type);    //Factory method
}
}
