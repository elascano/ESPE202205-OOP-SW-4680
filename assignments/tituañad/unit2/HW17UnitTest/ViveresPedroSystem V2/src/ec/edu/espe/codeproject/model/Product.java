package ec.edu.espe.codeproject.model;

import java.util.ArrayList;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 * 
 */
public class Product {
    private int code;
    private float price;
    private int lote;
    private String name;
    private String descrption;
    private ArrayList<Customer> costumers;
        private ArrayList<Cashier> cachiers;

    public Product(int code, float price, int lote, String name, String descrption, ArrayList<Customer> costumers, ArrayList<Cashier> cachiers) {
        this.code = code;
        this.price = price;
        this.lote = lote;
        this.name = name;
        this.descrption = descrption;
        this.costumers = costumers;
        this.cachiers = cachiers;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
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
     * @return the lote
     */
    public int getLote() {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(int lote) {
        this.lote = lote;
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
     * @return the descrption
     */
    public String getDescrption() {
        return descrption;
    }

    /**
     * @param descrption the descrption to set
     */
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    /**
     * @return the costumers
     */
    public ArrayList<Customer> getCostumers() {
        return costumers;
    }

    /**
     * @param costumers the costumers to set
     */
    public void setCostumers(ArrayList<Customer> costumers) {
        this.costumers = costumers;
    }

    /**
     * @return the cachiers
     */
    public ArrayList<Cashier> getCachiers() {
        return cachiers;
    }

    /**
     * @param cachiers the cachiers to set
     */
    public void setCachiers(ArrayList<Cashier> cachiers) {
        this.cachiers = cachiers;
    }
    public void reciveCostumer(Customer costumer){
        
    }
    public void reciveCashier(Cashier cashier){
        
    }
    
}    