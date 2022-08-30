package AbstractFactory;

/**
 *
 * @author Chavez Genaro, DCCO-ESPE, DAMAGE SE
 */
class WinButton extends Button {
    public void paint() {
        System.out.println("I'm a WinButton: “ + caption");
    }
}