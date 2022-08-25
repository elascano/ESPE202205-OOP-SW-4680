
package ec.edu.espe.CoopLatina.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Gas {
    private String name;
    private int stock;
    private int consume;

    public Gas(String name, int stock, int consume) {
        this.name = name;
        this.stock = stock;
        this.consume = consume;
    }

    @Override
    public String toString() {
        return "Gas{" + "name=" + name + ", stock=" + stock + ", consume=" + consume + '}';
    }
  
    
    
    
    
    public void pay(){
        
    }
    public void addGas(){
        
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

    /**
     * @return the consume
     */
    public int getConsume() {
        return consume;
    }

    /**
     * @param consume the consume to set
     */
    public void setConsume(int consume) {
        this.consume = consume;
    }
    
    
    
    
}




