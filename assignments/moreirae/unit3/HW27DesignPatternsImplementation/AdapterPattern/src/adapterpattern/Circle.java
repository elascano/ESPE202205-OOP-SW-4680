
package adapterpattern;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Circle extends Shape {

    private XXCircle pxc;

    public Circle() {
    pxc = new XXCircle();
    }

    public void display() {
    pxc.displayIt();
    }
    
}
