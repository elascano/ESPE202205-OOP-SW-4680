
package ec.espe.edu.products.model;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Services {
    private String service;
    private int price;
    private String avaible;

    public Services(String service, int price, String avaible) {
        this.service = service;
        this.price = price;
        this.avaible = avaible;
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
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the avaible
     */
    public String getAvaible() {
        return avaible;
    }

    /**
     * @param avaible the avaible to set
     */
    public void setAvaible(String avaible) {
        this.avaible = avaible;
    }
    
    
    
}
