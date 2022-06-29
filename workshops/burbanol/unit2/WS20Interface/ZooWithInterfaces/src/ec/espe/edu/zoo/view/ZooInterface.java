
package ec.espe.edu.zoo.view;

import ec.espe.edu.zoo.controller.Cow;
import ec.espe.edu.zoo.controller.IAnimal;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class ZooInterface {
    
    public static void main(String[] args) {
        IAnimal iAnimal;
        iAnimal = new Cow();
        iAnimal.feed();
        
        System.out.println("iAnimal -->" + iAnimal);
        System.out.println("cow " + iAnimal);
        
    }
    
}
