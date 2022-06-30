/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class Salmon extends Fish{

    public Salmon(int id, String description, String cage) {
        super(id, description, cage);
    }

    @Override
    public String toString() {
        return "Salmon{" + '}';
    }

    
    @Override
    public void feed() {
        System.out.println("Feeding the salmon");
    }

    @Override
    public void addToZoo(Zoo zoo) {
      System.out.println("Adding salmon to Zoo--->"+ zoo);  
    }
    
}
