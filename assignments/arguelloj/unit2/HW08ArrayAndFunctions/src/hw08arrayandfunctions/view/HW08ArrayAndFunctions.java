package hw08arrayandfunctions.view;

import hw08arrayandfunctions.model.Person;
import java.util.ArrayList;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class HW08ArrayAndFunctions {


    public static void main(String[] args) {
        
        
        
        ArrayList<Person> people;
        int numbersOfArray[];
        Person person;
       
        people = new ArrayList<>();
        numbersOfArray= new int[10];
        
        
        //Arrays of primitive types
        for (int i = 0; i < 10; i++) {
            numbersOfArray[i]=i;
        }
        System.out.println("Unmodified");
        for (int i = 0; i < 10; i++) {
            System.out.println(numbersOfArray[i]);
        }
        for (int i = 0; i < 10; i++) {
            numbersOfArray[i]= changeValueArrayInt(numbersOfArray[i]);
        }
        System.out.println("Modified");
         for (int i : numbersOfArray) {
            System.out.println(i);
        }
         
        //Arrays of objetc types
        for (int i = 0; i < 4; i++) {
            person = new Person("Joel " + i , 2355);
            people.add(person);
        }
        
        
        System.out.println("Unmodified");
        System.out.println(people);
        System.out.println("Modified");
        changeValueObjectPerson(people.get(1));
        
        System.out.println(people);
        
        
        
    }
    
    public static int changeValueArrayInt(int number){
        return number+10;
    }
    
    public static void changeValueObjectPerson(Person person){
        person.setName(person.getName()+" has been modificated");
    }
    
}
