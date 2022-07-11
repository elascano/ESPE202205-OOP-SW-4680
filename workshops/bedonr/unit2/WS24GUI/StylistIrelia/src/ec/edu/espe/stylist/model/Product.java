
package ec.edu.espe.stylist.model;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Product {
   
    private String name;
    private Double price;
    private String supplier;
    private String expiration;

    public Product(String name, Double price, String supplier, String expiration) {
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        this.expiration = expiration;
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
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
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

    /**
     * @return the expiration
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * @param expiration the expiration to set
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
    
    
    

    
   
    
}
