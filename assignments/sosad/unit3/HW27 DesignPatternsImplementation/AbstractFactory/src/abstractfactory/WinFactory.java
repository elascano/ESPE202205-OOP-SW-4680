
package abstractfactory;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class WinFactory extends GUIFactory{

    public Button createButton() {
        return (new WinButton());
    }

    public Menu createMenu() {
        return (new WinMenu());
    }

    
}
