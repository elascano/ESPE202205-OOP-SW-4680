/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class Cow extends Mammal {
    
    private int litersPerDay;

    @Override
    public String toString() {
        return "Cow{" + "litersPerDay=" + litersPerDay + '}';
    }

    public Cow(int id, String description, String cage) {
        super(id, description, cage);
    }

    public Cow() {
    }

    public Cow(int litersPerDay) {
        this.litersPerDay = litersPerDay;
    }

 

    @Override
    public void feed() {
        System.out.println("Fedding a cow");    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("Adding this cow to zoo");    }

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
