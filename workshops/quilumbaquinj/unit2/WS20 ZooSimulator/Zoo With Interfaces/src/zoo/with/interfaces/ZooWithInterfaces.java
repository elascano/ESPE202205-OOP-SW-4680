/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoo.with.interfaces;

import ec.edu.expe.zoo.model.Cow;
import ec.edu.expe.zoo.model.IAnimal;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class ZooWithInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IAnimal animal;
        animal= new Cow();
        animal.feed();
        
        System.out.println("Class is of type"+animal.getClass());
        
    }
    
}
