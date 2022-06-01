/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class Food {
    private int amount;

    public Food(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Food{" + "amount=" + getAmount() + '}';
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
