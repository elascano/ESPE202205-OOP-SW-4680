
package ec.edu.espe.DesignPatterns.model;

/**
 *
 * @author Elkin Pabon, DCCO ESPE, DEES Developers
 */
 
public class TestStrategyPattern {
 
    public static void main(String[] args) {
        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.publishText("Testing text in caps...");
         
        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in lower...");
 
    }
 
}