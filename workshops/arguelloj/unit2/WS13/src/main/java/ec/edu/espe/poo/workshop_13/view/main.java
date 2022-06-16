package ec.edu.espe.poo.workshop_13.view;

import ec.edu.espe.poo.workshop_13.model.Person;
import java.util.*;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class main {

    public static void main(String[] args) {
        Person people;
        ArrayList<Person> peopleData;
        
        peopleData = new ArrayList<>();
        
        people = new Person("Joel", 20);
        peopleData.add(people);
        people = new Person("Juan", 23);
        peopleData.add(people);
        people = new Person("Luis", 25);
        peopleData.add(people);
        people = new Person("Mario", 10);
        peopleData.add(people);
        people = new Person("Marco", 21);
        peopleData.add(people);
        
        
        for (int i = 0; i < peopleData.size(); i++) {
            System.out.println(peopleData.get(i).toString());
            
        }
    }
}
