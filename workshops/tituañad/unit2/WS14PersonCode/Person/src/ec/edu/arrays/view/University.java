package ec.edu.arrays.view;

import ec.edu.arrays.model.Person;



/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class University {

    
    public static void main(String[] args) {
        Person[] people= new Person [3];
        
        
        people[0] = new Person (1, "Daniela Tituaña", "OOP");
        people[1] = new Person (2, "Katherine Paladines", "OOP");
        people[2] = new Person (3, "Juan Carrion", "OOP");
        people[3] = new Person (4, "Dylan Espin", "OOP");
        
        
        for (int i=0; i<3; i++){
            System.out.println("Person ( "+(i+1)+")\t-> "+people[i]);
      
        
        
    }
    
}
}
