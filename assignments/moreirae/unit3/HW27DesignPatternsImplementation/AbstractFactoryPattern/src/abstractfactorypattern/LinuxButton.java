
package abstractfactorypattern;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
class LinuxButton extends Button{

    public void paint() {
System.out.println("I'm a LinuxButton: " + caption);
}
    
}
