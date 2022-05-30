/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.stylesirelia.model;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class Supplier {
    
    private String name;
    private int number;
    private boolean pendingPayment;
    private String appointment;
    private String address;

    public Supplier(String name, int number, boolean pendingPayment, String appointment, String address) {
        this.name = name;
        this.number = number;
        this.pendingPayment = pendingPayment;
        this.appointment = appointment;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Supplier{" + "name=" + name + ", number=" + number + ", pendingPayment=" + pendingPayment + ", appointment=" + appointment + ", address=" + address + '}';
    }
    
    
    
    
    public void pay(){
        
    }
    public void addOrder(){
        
    }
    public void cancelOrder(){
        
    }
    public void editOrder(){
        
    }
    public void addSupplier(){
        
    }
    public void editSupplier(){
        
    }
    public void removeSupplier(){
        
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
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
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
     * @return the appointment
     */
    public String getAppointment() {
        return appointment;
    }

    /**
     * @param appointment the appointment to set
     */
    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
