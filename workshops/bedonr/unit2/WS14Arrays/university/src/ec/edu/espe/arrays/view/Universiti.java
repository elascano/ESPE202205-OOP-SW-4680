
package ec.edu.espe.arrays.view;

import ec.edu.espe.arrays.model.Person;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Universiti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person[] people=new Person[5];
       
       
        people[0]=new Person(1, "Anibal Roguiguez","OOP");
        people[1]=new Person(2, "Juan Montalvo","OOP");
        people[2]=new Person(3, "Maria Stefania","OOP");
        people[3]=new Person(5, "Jose Alban","OOP");
        people[4]=new Person(3, "Alex Bedon","OOP");
        
        System.out.println("Unmodified");
        for (int i = 0; i < 5; i++){
            System.out.println("Person (" + (i+1)+")\t-> "+people[i]);
        }
    }


}
         
       
 

    
    

