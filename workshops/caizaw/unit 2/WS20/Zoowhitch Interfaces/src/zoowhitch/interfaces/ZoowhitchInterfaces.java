/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoowhitch.interfaces;
import ec.edu.espe.controller.IAnimal;
import ec.edu.espe.model.Cow;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class ZoowhitchInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      IAnimal iAnimal;
       
       iAnimal = new Cow();
       
       iAnimal.feed();
       
        System.out.println("iAnimal -->" + iAnimal.getClass());
       
        System.out.println("cow " + iAnimal);
        
       
    }  
}
