package AbstractFactory;

/**
 *
 * @author Chavez Genaro, DCCO-ESPE, DAMAGE SE
 */
class LinuxButton extends Button {
    public void paint() {
        System.out.println("I'm a LinuxButton: “ + caption");
    }
}
