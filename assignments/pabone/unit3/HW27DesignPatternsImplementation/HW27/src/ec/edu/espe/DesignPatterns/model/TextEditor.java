
package ec.edu.espe.DesignPatterns.model;

/**
 *
 * @author Elkin Pabon, DCCO ESPE, DEES Developers
 */
public class TextEditor {
     
    private final TextFormatter textFormatter;
     
    public TextEditor(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }
     
    public void publishText(String text){
        textFormatter.format(text);
    }
 
}