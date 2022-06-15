package ec.edu.espe.arrays.view;

import java.util.ArrayList;
import ec.edu.espe.arrays.model.Person;

/**
 * @author Elkin Pabon, DCCO ESPE, DEES Developers
 */

public class arrayDisplay {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ArrayList<Person> persons;
        int arrays[];
        Person person;
        persons = new ArrayList<>();
        arrays= new int[5];
        
            for (int i=0; i<5; i++) {
            arrays[i]=i;
            }
            System.out.println("--  BEFORE  --");
                for (int i=0; i<5; i++) {
                System.out.println("Number  <  " + arrays[i] + "  >");
                }
                    for (int i = 0; i < 5; i++) {
                    arrays[i] = modifiedArray(arrays[i]);
                    }
                    System.out.println("--  AFTER  --");
                        for (int i : arrays) {
                        System.out.println("Number  <  " + i + "  >");
                        }
                            for (int i = 0; i < 4; i++) {
                            person = new Person(" Elkin  " + i , 10);
                            persons.add(person);
                            }
                            
        System.out.println("--  BEFORE  --");
        System.out.println(persons);
        System.out.println("--  AFTER  --");
        modifiedObject(persons.get(1));
        
        System.out.println(persons);
 
    }
    
    public static int modifiedArray(int number){
        return number+10;
    }
    public static void modifiedObject(Person person){
        person.setName( person.getName()+ " has been modificated");
    }
    
}
