
package abstractfactorypattern;

import java.awt.Button;
import java.awt.Menu;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
class WinFactory extends GUIFactory {
    public Button createButton() {
    return(new Button());
}
    
public Menu createMenu() {
    return(new Menu());
}

}
