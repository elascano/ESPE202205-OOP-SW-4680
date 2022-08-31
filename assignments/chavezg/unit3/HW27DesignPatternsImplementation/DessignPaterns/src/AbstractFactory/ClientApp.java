package AbstractFactory;

import java.awt.Button;

/**
 *
 * @author Chavez Genaro, DCCO-ESPE, DAMAGE SE
 */
class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
}