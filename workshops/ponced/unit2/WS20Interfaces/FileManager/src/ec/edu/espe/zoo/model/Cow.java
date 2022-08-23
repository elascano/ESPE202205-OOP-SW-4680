/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class Cow extends Mammal{

    private int litersPerDay;

    public Cow(int id, String description, String cage) {
        super(id, description, cage);
      
    }

    public Cow(int litersPerDay, int id, String description, String cage) {
        super(id, description, cage);
        this.litersPerDay = litersPerDay;
    }

    

    @Override
    public String toString() {
        return super.toString() + "Cow{" + "litersPerDay=" + getLitersPerDay() + '}';
    }
    
    
   
    @Override
    public void feed() {
        System.out.println("Feeding the cow");   
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("Adding this cow to the Zoo" + zoo);    
    }

    /**
     * @return the litersPerDay
     */
    public int getLitersPerDay() {
        return litersPerDay;
    }

    /**
     * @param litersPerDay the litersPerDay to set
     */
    public void setLitersPerDay(int litersPerDay) {
        this.litersPerDay = litersPerDay;
    }
    
}
