package AbstractFactory;

/**
 *
 * @author Chavez Genaro, DCCO-ESPE, DAMAGE SE
 */
class LinuxFactory extends GUIFactory {
    public Button createButton() {
        return(new LinuxButton());
    }
    public Menu createMenu() {
        return(new LinuxMenu());
    }
}