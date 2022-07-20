
package ec.edu.espe.stylistirelia.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Product {
    
    private String name;
    private float price;
    private String supplier;

    public Product(String name, float price, String supplier) {
        this.name = name;
        this.price = price;
        this.supplier = supplier;
    }

    public void see(){
        List<Product> products;       //le inicialise como lista
        products = new ArrayList<>();     //pero le inicialise como arrays list
        
        
        Set<String>names;
        names = new TreeSet<>();
        
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
     * @return the supplier
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    
    
    
    
    
    
    
    
}
