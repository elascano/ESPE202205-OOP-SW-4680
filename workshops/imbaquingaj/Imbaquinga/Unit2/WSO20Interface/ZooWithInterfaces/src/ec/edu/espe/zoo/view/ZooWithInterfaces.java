package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.controller.Cow;
import ec.edu.espe.zoo.controller.IAnimal;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
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
