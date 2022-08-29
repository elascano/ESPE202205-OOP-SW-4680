package abstractfactorypattern;


import java.awt.Button;
import java.awt.Graphics;



/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
class ClientApp {
    
    public static void main(String[] args) {
    
    GUIFactory aFactory = GUIFactory.getFactory();
    Button aButton = aFactory.createButton();
    //aButton.caption = "Play";
    Graphics g = null;
    aButton.paint(g);
    
}
 }
