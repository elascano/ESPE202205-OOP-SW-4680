package ec.edu.espe.styliesirelia.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class Customer {

    private int id;
    private String name;
    private float price;

    public Customer(int id, String name, float totalSales) {
        this.id = id;
        this.name = name;
        this.price = totalSales;
    }

    public void see() {
        List<Customer> customers;
        customers = new ArrayList<>();

        Set<String> names;
        names = new TreeSet<>();
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

}
