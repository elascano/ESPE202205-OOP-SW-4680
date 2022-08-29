package AbstractFactory;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
class LinuxFactory extends GUIFactory {
    public Button createButton() {
        return(new LinuxButton());
    }
    public Menu createMenu() {
        return(new LinuxMenu());
    }
}