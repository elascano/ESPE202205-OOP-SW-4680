
package abstractfactory;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class LinuxFactory extends GUIFactory {

    public LinuxFactory() {
    }

    public Button createButton() {
        return (new LinuxButton());
    }

    public Menu createMenu() {
        return (new LinuxMenu());
    }
}
