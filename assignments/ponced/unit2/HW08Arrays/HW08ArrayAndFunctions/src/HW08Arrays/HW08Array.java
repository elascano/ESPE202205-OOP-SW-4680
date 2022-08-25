
package HW08Arrays;

import java.util.ArrayList;

/**
 *
 * @author Diego Ponce
 */
public class HW08Array {


    public static void main(String[] args) {
        
        
        
        ArrayList<Person> persons;
        int[] Arrays;
        Person person;
       
        persons = new ArrayList<>();
        Arrays= new int[10];
        
        //Arrays of primitive types
        for (int i = 0; i < 10; i++) {
            Arrays[i]=i;
        }
        System.out.println("Sin modificar");
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays[i]);
        }
        for (int i = 0; i < 10; i++) {
            Arrays[i]= changeValueArrayInt(Arrays[i]);
        }
        System.out.println("Modificados");
         for (int i : Arrays) {
            System.out.println(i);
        }
        //Arrays of objetc types
        for (int i = 0; i < 4; i++) {
            person = new Person("Juan Diego " + i , 1553);
            persons.add(person);
        }
        System.out.println("Sin modificar");
        System.out.println(persons);
        System.out.println("Modificados");
        changeValueObjectPerson(persons.get(1));
        
        System.out.println(persons);
        
        
        
    }
    
    public static int changeValueArrayInt(int number){
        return number+10;
    }
    public static void changeValueObjectPerson(Person person){
        person.setName(person.getName()+" fue modificado");
    }
    
}
