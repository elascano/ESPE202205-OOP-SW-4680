
package ec.edu.espe.CoopLatina.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class SquareParts {
    
    private String name;
    private float price ;
    private String wear;
    private int stock;

    public SquareParts(String name, float price, String wear, int stock) {
        this.name = name;
        this.price = price;
        this.wear = wear;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "SquareParts{" + "name=" + name + ", price=" + price + ", wear=" + wear + ", stock=" + stock + '}';
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
     * @return the wear
     */
    public String getWear() {
        return wear;
    }

    /**
     * @param wear the wear to set
     */
    public void setWear(String wear) {
        this.wear = wear;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
