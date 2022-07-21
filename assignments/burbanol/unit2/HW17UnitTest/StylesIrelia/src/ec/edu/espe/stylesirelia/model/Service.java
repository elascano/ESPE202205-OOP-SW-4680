/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.stylesirelia.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Service {
    private String name;
    private float price;
    private boolean pendingPayment;
    private boolean available;
    private ArrayList<Stylist>availableStylist;

    public Service(String name, float price, boolean pendingPayment, boolean available, ArrayList<Stylist> availableStylist) {
        this.name = name;
        this.price = price;
        this.pendingPayment = pendingPayment;
        this.available = available;
        this.availableStylist = availableStylist;
    }

    @Override
    public String toString() {
        return "Service{" + "name=" + name + ", price=" + price + ", pendingPayment=" + pendingPayment + ", available=" + available + ", availableStylist=" + availableStylist + '}';
    }
    
     public String toStringData() {
        return name + "," + pendingPayment + "," + available + "," + availableStylist;
    }
    
    
    
    public void chargue(){
        
    }
    public void deactivate(){
        
    }
    public void activate(){
        
    }
    public void addStylist(){
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the pendingPayment
     */
    public boolean isPendingPayment() {
        return pendingPayment;
    }

    /**
     * @param pendingPayment the pendingPayment to set
     */
    public void setPendingPayment(boolean pendingPayment) {
        this.pendingPayment = pendingPayment;
    }

    /**
     * @return the available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * @return the availableStylist
     */
    public ArrayList<Stylist> getAvailableStylist() {
        return availableStylist;
    }

    /**
     * @param availableStylist the availableStylist to set
     */
    public void setAvailableStylist(ArrayList<Stylist> availableStylist) {
        this.availableStylist = availableStylist;
    }
    
}
