/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model1.Animal;
import ec.edu.espe.zoo.model1.Cow;
import ec.edu.espe.zoo.model1.Pig;
import ec.edu.espe.zoo.model1.Zoo;
import java.util.ArrayList;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class FileManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Zoo zoo;
        Cow cow;
        Pig pig;
        ArrayList<Animal> animals;
        animals = new ArrayList<>();
        
        zoo = new Zoo("Guayllabamba",animals);
        cow = new Cow (1,"Hosteils","cage1");
        pig = new Pig(12.4F, 2, "Danish","cage2");
        
    }
    
}
