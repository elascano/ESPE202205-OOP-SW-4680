package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.controller.Cow;
import ec.edu.espe.zoo.controller.IAnimal;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class ZooWithInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       IAnimal iAnimal;
       
       iAnimal = new Cow();
       
       iAnimal.feed();
       
        System.out.println("iAnimal -->" + iAnimal.getClass());
       
        System.out.println("cow " + iAnimal);
        
       
    }
    
}
