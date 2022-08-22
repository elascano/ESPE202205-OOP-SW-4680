
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public abstract class Factory {
    public Factory() {
    protected abstract connection createConnection(String type);
}
