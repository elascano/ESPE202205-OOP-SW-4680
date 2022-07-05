/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Cow extends Mammal{
    private int litersPerDay;

    public Cow(int id, String description, String Cage) {
        super(id, description, Cage);
    }

    

     
        
    @Override
    public void feed() {
        System.out.println("feeding a cow");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("adding this cow to the zoo"+zoo);
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

    @Override
    public String toString() {
        return "Cow{" +super.toString()+ "litersPerDay=" + litersPerDay + '}';
    }
    
}
