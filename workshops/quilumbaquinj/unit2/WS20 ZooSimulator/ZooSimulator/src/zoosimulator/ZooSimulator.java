/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosimulator;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Cow;
import ec.edu.espe.zoo.model.Pig;
import ec.edu.espe.zoo.model.Zoo;
import java.util.ArrayList;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class ZooSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal;
        Zoo zoo;
        Pig pig;
        Cow cow;
        ArrayList<Animal> animals;
        
        animals= new ArrayList<>();
        cow = new Cow(0,"","cage1");
        pig = new Pig(12.4F,2,"","cage1");
        
        animal= new Cow(0,"","cage1");
        animal= new Pig(12.4F,2,"","cage1");
        
        animals.add(cow);
        animals.add(pig);
        
        zoo= new Zoo("Guayllabamba",animals);
        
        System.out.println("Cow ->" +cow);
        System.out.println("Pig ->" +pig);
        System.out.println("Zoo->"+animals);
        
        pig.addToZoo(zoo);
        
    }
    
}
