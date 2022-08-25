
package abstractfactory;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class ClientApp {

    
    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
    
}
