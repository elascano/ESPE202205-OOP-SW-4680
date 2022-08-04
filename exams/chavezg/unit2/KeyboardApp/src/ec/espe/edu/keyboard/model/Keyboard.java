/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.keyboard.model;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class Keyboard {
    private String id;
    private String name;
    private String price;
    private String year;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    public Keyboard(String id, String name, String price, String year) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public Keyboard() {
    }

    @Override
    public String toString() {
        return "Keyboard{" + "id=" + id + ", name=" + name + ", price=" + price + ", year=" + year + '}';
    }
    
    
}
