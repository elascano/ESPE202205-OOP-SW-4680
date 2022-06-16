
package ec.edu.espe.arrays.view;

import ec.edu.espe.arrays.model.Person;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person[] Persons=new Person[23];
        Persons[0]=new Person(1,"Joel Arguello","ESPE");
        Persons[1]=new Person(2,"Cris Cabezas","ESPE");
        Persons[2]=new Person(3,"Beronica Espinosa","ESPE");

        for(int i=0; i<23;i++){
            System.out.println("Person ("+(i+1)+") \t->"+Persons[i]);
        }
    }
    
}
