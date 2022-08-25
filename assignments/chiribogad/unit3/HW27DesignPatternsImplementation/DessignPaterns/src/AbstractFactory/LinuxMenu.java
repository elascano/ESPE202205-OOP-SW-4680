package AbstractFactory;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
class LinuxMenu extends Menu {
    public void paint() {
        System.out.println("I'm a LinuxMenu: “ + caption");
    }
}
