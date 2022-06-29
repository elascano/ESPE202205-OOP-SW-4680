package com.mycompany.numbers;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */

public class HW08ArrayAndFunctions {

    public static void main(String[] args) {
                ArrayList<Person>  persons;
        int[] numeroDeArreglos;
        Person person;
        
        persons = new ArrayList<>();
        numeroDeArreglos = new int [10];
        
        for (int i = 0; i< 10 ; i++){
            numeroDeArreglos[i] = i;
        }
        System.out.println("Sin modificar");
        for (int i= 0; i<10 ; i++){
            System.out.println(numeroDeArreglos[i]);
        }
        for (int i=0; i<10 ; i++){
            numeroDeArreglos[i] = changeValueArrayInt(numeroDeArreglos[i]);
        }
        System.out.println("Modificado");
        for (int i : numeroDeArreglos){
            System.out.println(i);
        }
        
        for (int i = 0 ; i<4; i++){
            person = new Person ("Raúl"+i,1378);
            person.add(person);
        }
        System.out.println("Sin modificar");
        System.out.println(persons);
        System.out.println("Modificado");
        changeValueObjectPerson(persons.get(1));
        System.out.println(persons);
    } 
    public static int changeValueArrayInt(int number){
        return number+10;
    }
    public static void changeValueObjectPerson(Person person){
        person.setName(person.getName()+" Ah sido modificado!");
    }

}