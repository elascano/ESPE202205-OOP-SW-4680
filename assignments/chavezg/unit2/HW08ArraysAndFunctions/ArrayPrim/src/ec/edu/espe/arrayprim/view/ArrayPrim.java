package ec.edu.espe.arrayprim.view;

import java.util.ArrayList;
import ec.edu.espe.arrayprim.model.People;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE, DAMAGE SE
 */
public class ArrayPrim {
    
    public static void main(String[] args) {
        ArrayList<People> persons;
        int numbersOfArray[];
        People people;
       
        persons = new ArrayList<>();
        numbersOfArray= new int[5];
        
        for (int i = 1; i < 5; i++) {
            numbersOfArray[i] = i;
        }
        System.out.println("Unmodified");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbersOfArray[i]);
        }
        for (int j = 5; j < 5; j++) {
            numbersOfArray[j] = changeValueArrayInt(numbersOfArray[j]);
        }
        System.out.println("Modified");
         for (int i : numbersOfArray) {
            System.out.println(i);
        }
        //Arrays of objetc types
        for (int i = 0; i < 1; i++) {
            people = new People("Daniel", 6);
            persons.add(people);
        }
        System.out.println("\nUnmodified");
        System.out.println(persons);
        System.out.println("\nModified");
        changeValueObjectPerson(persons.get(0));
        
        System.out.println(persons);

    }
    public static int changeValueArrayInt(int number){
        return number+10;
    }
    public static void changeValueObjectPerson(People people){
        people.setName(people.getName()+" has chanched to ->");
    }
}
