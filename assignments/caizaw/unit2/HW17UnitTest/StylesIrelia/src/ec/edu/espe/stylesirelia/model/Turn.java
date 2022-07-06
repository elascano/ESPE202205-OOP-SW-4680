/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.stylesirelia.model;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Turn {
    private int id;
    private String date;
    
    private String customer;
    private String service;
    private String stylist;

    public Turn(int id, String date, String customer, String service, String stylist) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.service = service;
        this.stylist = stylist;
    }

    @Override
    public String toString() {
        return "yout Turn->>" + "id=" + id + ", date=" + date + ", customer=" + customer + ", service=" + service + ", stylist=" + stylist + '}';
    }
    
    
    
    
    public void addTurn(){
        
    }
    public void editTurn(){
        
    }
    public void removeTurn(){
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * @return the stylist
     */
    public String getStylist() {
        return stylist;
    }

    /**
     * @param stylist the stylist to set
     */
    public void setStylist(String stylist) {
        this.stylist = stylist;
    }
}
