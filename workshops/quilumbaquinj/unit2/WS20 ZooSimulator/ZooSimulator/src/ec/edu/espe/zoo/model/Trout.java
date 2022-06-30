/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Trout extends Fish{

    public Trout() {
        super();
    }

    
    @Override
    public void feed() {
        System.out.println("feeding a trout");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("adding this animal to the zoo"+zoo);
    }

    
    
}
