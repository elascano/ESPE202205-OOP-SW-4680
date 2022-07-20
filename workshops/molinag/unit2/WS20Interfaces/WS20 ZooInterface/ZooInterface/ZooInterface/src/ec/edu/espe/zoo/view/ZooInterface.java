
package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.controller.Cow;
import ec.edu.espe.zoo.controller.IAnimal;

/**
 *
 * @author Quimbiulco Juan, DCCO-ESPE
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
