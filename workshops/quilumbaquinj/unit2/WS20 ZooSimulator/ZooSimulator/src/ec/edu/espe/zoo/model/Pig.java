/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Pig extends Mammal {
    private float weigth;

    public Pig(float weigth) {
        super();
        this.weigth = weigth;
    }

    public Pig() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void feed() {
        System.out.println("feeding a pig");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("adding this animal to the zoo"+zoo);
    }

    @Override
    public String toString() {
        return "Pig{" + "weigth=" + getWeigth() + '}';
    }

    /**
     * @return the weigth
     */
    public float getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }
    
}
