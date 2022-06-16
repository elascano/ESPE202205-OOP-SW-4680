
package ec.edu.espe.ArrayFunction.view;

import ejercicoenclase.Person;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class HW08ArraywithFunction {

  
    public static void main(String[] args) {
        
        Person[] people;
        people = new Person[3];
        for (int i = 0; i < 3; i++) {
            people[i] = new Person(i + 1, "name " + (i + 1), "course" + (i + 1));
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("person { " + (i + 1) + " }" + "->" + people[i]);
        }
        
        System.out.println("Original Array");
        Person p = new Person(1, "Dario", "POO");
        System.out.println(p);
        modifyPerson(p);
        System.out.println("\nArray after the function");
        System.out.println(p);

        int arrayofNumbers[] = {4, 9, 755};
        System.out.println("\nOriginal Array");
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayofNumbers[i]);
        }
        System.out.println("\nArray in the function");
        modifyArray(arrayofNumbers);
        System.out.println("\nArray after the function");
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayofNumbers[i]);
        }

    }

    public static void modifyArray(int[] arrayofFunction) {

        for (int i = 0; i < 3; i++) {
            System.out.println(arrayofFunction[i] + 9);

        }

    }

    public static void modifyPerson(Person person) {
        person.setName("Pedro");
        person.setCourse("Physics");
        person.setId(10);
    }
}
