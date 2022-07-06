package filemanager;
import ec.edu.espe.zoo.model1.Animal;
import ec.edu.espe.zoo.model1.Cow;
import ec.edu.espe.zoo.model1.Pig;
import ec.edu.espe.zoo.model1.Zoo;
import java.util.ArrayList;

import ec.edu.espe.zoo.model1.Zoo;

import ec.edu.espe.zoo.model1.Zoo;

import ec.edu.espe.zoo.model1.Zoo;

import ec.edu.espe.zoo.model1.Zoo;

import ec.edu.espe.zoo.model1.Zoo;

import ec.edu.espe.zoo.model1.Zoo;

import ec.edu.espe.zoo.model1.Zoo;

import ec.edu.espe.zoo.model1.Zoo;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class FIleManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zoo zoo;
        Cow cow;
        Pig pig;
        ArrayList<Animal> animals;
        animals = new ArrayList<>();
        
        zoo = new Zoo("Guayllabamba", animals);
        cow = new Cow(1, "Holstein", "cage1");

        animals.add(cow);
        
        pig = new Pig(12.4F, 2, "Danish", "cage2");
        animals.add(pig);
        
        System.out.println("cow -> " + cow);
        System.out.println("pig -> " + pig);
        
        System.out.println("cow id -> " + cow.getId());
        
        cow.feed();
        cow.addtoZoo(zoo);
        
        pig.addtoZoo(zoo);
        pig.feed();
        
        System.out.println("Zoo animals -> " + animals);
    } 
    }
    

