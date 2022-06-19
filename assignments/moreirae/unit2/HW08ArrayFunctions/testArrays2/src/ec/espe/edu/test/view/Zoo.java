
package ec.espe.edu.test.view;

import ec.espe.edu.test.model.Animal;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Zoo {
    public static void main(String[] args) {
        Animal animal[] = new Animal[5];
       animal[0] = new Animal(1, 5, "Lion");
       animal[1] = new Animal(2, 3, "Monkey");
       animal[2] = new Animal(3, 2, "Tiger");
       animal[3] = new Animal(4, 1, "Panda");
       animal[4] = new Animal(5, 4, "Bear");
      
       for(int i=0; i<5; i++){
           System.out.println("The Animals are: ->"+ animal[i]);
       }
       modifyAnimal(animal);
        System.out.println("\n");
              for(int i=0; i<5; i++){
           System.out.println("The Animals are: ->"+ animal[i]);
       }
       
    }
    
    public static void modifyAnimal(Animal[] animal){
        animal[0].setAge(7);
        animal[0].setName("Owl");
        animal[1].setAge(13);
        animal[1].setName("Giraffe");
    }
}
