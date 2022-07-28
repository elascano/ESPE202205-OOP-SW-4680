package ec.espe.edu.bakery.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Customer {
    private int id;
    private String name;
    private float totalSale;

    public Customer(int id, String name, float totalSale) {
        this.id = id;
        this.name = name;
        this.totalSale = totalSale;
    }

    public void see(){
        List<Customer> customers;
        customers = new ArrayList<>();
        
        Set<String> names;
        names = new TreeSet<>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(float totalSale) {
        this.totalSale = totalSale;
    }
    
}
