package AbstractFactory;

/**
 *
 * @author Chavez Genaro, DCCO-ESPE, DAMAGE SE
 */
class WinFactory extends GUIFactory {
    public Button createButton() {
        return(new WinButton());
}
    public Menu createMenu() {
       return(new WinMenu());
    }
}