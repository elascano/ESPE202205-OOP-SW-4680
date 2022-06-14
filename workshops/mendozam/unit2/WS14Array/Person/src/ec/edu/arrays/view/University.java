package ec.edu.arrays.view;

import ec.edu.arrays.model.Person;



/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class University {

    
    public static void main(String[] args) {
        Person[] people= new Person [3];
        
        
        people[0] = new Person (1, "Mateo Mendoza", "OOP");
        people[1] = new Person (2, "Martin Mena", "OOP");
        people[2] = new Person (3, "Joan Ortegaa", "OOP");
        
        
        for (int i=0; i<3; i++){
            System.out.println("Person ( "+(i+1)+")\t-> "+people[i]);
      
        
        }
    
    }
}
