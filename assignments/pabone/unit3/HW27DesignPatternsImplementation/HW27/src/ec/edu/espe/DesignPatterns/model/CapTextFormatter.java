
package ec.edu.espe.DesignPatterns.model;

/**
 *
 * @author Elkin Pabon, DCCO ESPE, DEES Developers
 */
 
public class CapTextFormatter implements TextFormatter{
 
    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]: "+text.toUpperCase());
    }
 
}