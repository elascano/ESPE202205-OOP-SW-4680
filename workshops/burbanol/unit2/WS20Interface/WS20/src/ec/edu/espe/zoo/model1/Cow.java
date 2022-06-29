/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Cow extends Mammal{

    private int litersPerFay;

    public Cow( int id, String description, String cage) {
        super(id, description, cage);

    }

    @Override
    public String toString() {
        return super.toString()+"Cow{" + "litersPerFay=" + litersPerFay + '}';
    }

    
    
    
    
    public int getLitersPerFay() {
        return litersPerFay;
    }

    public void setLitersPerFay(int litersPerFay) {
        this.litersPerFay = litersPerFay;
    }
    
    
    
    
    @Override
    public void feed() {
        System.out.println("Feeding a cow");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("Adding cow to zoo ->>" + zoo);
    }
    
}
