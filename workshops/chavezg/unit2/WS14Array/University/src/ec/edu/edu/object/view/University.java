package ec.edu.edu.object.view;

import ec.edu.espe.object.model.Person;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE, DAMAGE SE
 */
public class University {
    public static void main(String[] args) {
        Person[] people = new Person[23];
        
        people[0] = new Person(1, "Dana Boada","OOP");
        people[1] = new Person(2, "Steven Reyes","OOP");
        people[2] = new Person(3, "Mateo Flores","OOP");
        people[3] = new Person(4, "Bran Vivanco","OOP");
        people[4] = new Person(5, "Josue Calvopiña","OOP");
        people[5] = new Person(6, "Daniel Torres","OOP");
        people[6] = new Person(7, "Steven Flores","OOP");
            
        for(int i = 0; i < 23; i++){
            System.out.println("Person (" + (i+1)+")\t-> " + people[i]);
          
        }
    }
}
