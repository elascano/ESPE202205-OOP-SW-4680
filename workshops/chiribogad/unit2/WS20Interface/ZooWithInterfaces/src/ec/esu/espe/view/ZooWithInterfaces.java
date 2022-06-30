package ec.esu.espe.view;

import ec.esu.espe.controller.Cow;
import ec.esu.espe.controller.IAnimal;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class ZooWithInterfaces {
    public static void main(String[] args) {
        IAnimal iAnimal;
        
        iAnimal = new Cow();
        
        iAnimal.feed();
        
        System.out.println("IAnimal -->" + iAnimal.getClass());
        
        System.out.println("cow "+ iAnimal);
    }
    
}
