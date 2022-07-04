
package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.controller.Cow;
import ec.edu.espe.zoo.controller.IAnimal;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class ZooInterface {
    public static void main(String[] args) {
        IAnimal iAnimal;
        iAnimal=new Cow();
        iAnimal.feed();
    
        System.out.println("iAnimal-->"+iAnimal.getClass());
        System.out.println("cow"+iAnimal);
    }
    
}
