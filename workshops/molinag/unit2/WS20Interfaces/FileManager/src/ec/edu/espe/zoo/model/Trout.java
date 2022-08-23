/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class Trout extends Fish{

    public Trout(int id, String description, String cage) {
        super(id, description, cage);
    }

    @Override
    public String toString() {
        return "Trout{" + '}';
    }

    
    
    @Override
    public void feed() {
        System.out.println("Feeding the trout");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("Adding trout to Zoo--->"+ zoo);
    }
    
}
