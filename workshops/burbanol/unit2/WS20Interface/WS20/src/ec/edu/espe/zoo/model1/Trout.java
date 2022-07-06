/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Trout extends Fish{

    public Trout(int id, String description, String cage) {
        super(id, description, cage);
    }
    
    

     @Override
    public void feed() {
        System.out.println("Feeding a trout");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("Adding a trout to zoo -->"+zoo);
    }
    
}
