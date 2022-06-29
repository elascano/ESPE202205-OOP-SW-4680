
package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.controller.Cow;
import ec.edu.espe.zoo.controller.IAnimal;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class ZooWithInterfaces {

  
    public static void main(String[] args) {
        IAnimal iAnimal;
        
        iAnimal = new Cow();
      
        iAnimal.feed();
        
        System.out.println("Animal--->"+iAnimal.getClass());
      
        System.out.println("cow "+iAnimal);
    }
    
}
