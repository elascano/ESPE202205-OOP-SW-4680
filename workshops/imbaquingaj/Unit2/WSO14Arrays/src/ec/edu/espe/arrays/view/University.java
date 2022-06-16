
package ec.edu.espe.arrays.view;

import ec.edu.espe.arrays.model.Person;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person[] Persons=new Person[23];
        Persons[0]=new Person(1,"Fidel Marguito","OOP");
        Persons[1]=new Person(2,"Marco Grando","OOP");
        Persons[2]=new Person(3,"Maria Sofia","OOP");

        for(int i=0; i<23;i++){
            System.out.println("Person ("+(i+1)+") \t->"+Persons[i]);
        }
    }
    
}
