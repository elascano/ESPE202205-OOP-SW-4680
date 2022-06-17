
package ec.edu.arrayandfunctions.view;

import ec.edu.arrayandfunctions.model.Person;
import java.util.ArrayList;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class ArrayAndFunctions {


    public static void main(String[] args) {
        
        ArrayList<Person> people;
        int[] numbersArray;
        Person person;
       
        people = new ArrayList<>();
        numbersArray= new int[20];
        
        //Array primitive 
        for (int i = 0; i < 20; i++) {
            numbersArray[i]=i;
        }
        System.out.println("Before Unmodified");
        for (int i = 0; i < 20; i++) {
            System.out.println(numbersArray[i]);
        }
        for (int i = 0; i < 20; i++) {
            numbersArray[i]= changeValueArrayInt(numbersArray[i]);
        }
        System.out.println("After Modified");
         for (int i : numbersArray) {
            System.out.println(i);
        }
        //Array objetc 
        for (int i = 0; i < 1; i++) {
            person = new Person("Daniela " + i , 220602);
            people.add(person);
        }
        System.out.println("Before Unmodified");
        System.out.println(people);
        System.out.println("After Modified");
        changeValueObjectPerson(people.get(0));
        
        System.out.println(people);
        
        
        
    }
    
    public static int changeValueArrayInt(int number){
        return number+10;
    }
    public static void changeValueObjectPerson(Person person){
        person.setName(person.getName()+" the modification is ");
    }
    
}
