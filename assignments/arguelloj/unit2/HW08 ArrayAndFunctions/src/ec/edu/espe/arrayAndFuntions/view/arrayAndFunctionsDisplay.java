package ec.edu.espe.arrayAndFuntions.view;

import ec.edu.espe.arrayAndFuntions.model.Person;
import java.util.ArrayList;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class arrayAndFunctionsDisplay {

    public static void main(String[] args) {

        ArrayList<Person> persons;
        int numbersOfArray[];
        Person person;

        persons = new ArrayList<>();
        numbersOfArray = new int[10];

        for (int i = 0; i < 5; i++) {
            numbersOfArray[i] = i;
        }
        System.out.println("Unmodified");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbersOfArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            numbersOfArray[i] = changeValueArrayInt(numbersOfArray[i]);
        }
        System.out.println("Modified");
        for (int i : numbersOfArray) {
            System.out.println(i);
        }

        for (int i = 0; i < 4; i++) {
            person = new Person("Joel" + i, 34);
            persons.add(person);
        }
        System.out.println("Unmodified");
        System.out.println(persons);
        System.out.println("Modified");
        changeValueObjectPerson(persons.get(1));

        System.out.println(persons);

    }

    public static int changeValueArrayInt(int number) {
        return number + 10;
    }

    public static void changeValueObjectPerson(Person person) {
        person.setName(person.getName() + " has been modificated!");
    }

}
