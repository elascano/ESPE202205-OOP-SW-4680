/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class Trout extends Fish {
  public Trout(int id, String description, String cage) {
        super(id, description, cage);
    }

    @Override
    public String toString() {
        return "Trout{" + '}';
    }

    @Override
    public void feed() {
        System.out.println("feeding a Trout");
    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("adding a trout to the Zoo -> " + zoo);
    }
    
}
