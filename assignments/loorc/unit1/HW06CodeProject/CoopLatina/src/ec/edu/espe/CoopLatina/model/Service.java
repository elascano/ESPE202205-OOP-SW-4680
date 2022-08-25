
package ec.edu.espe.CoopLatina.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Service {
    private String name;
    private float price;
    private boolean pendingPayment;
    private boolean avalible;

    public Service(String name, float price, boolean pendingPayment, boolean avalible) {
        this.name = name;
        this.price = price;
        this.pendingPayment = pendingPayment;
        this.avalible = avalible;
    }

    @Override
    public String toString() {
        return "Service{" + "name=" + name + ", price=" + price + ", pendingPayment=" + pendingPayment + ", avalible=" + avalible + '}';
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
     * @return the pendingPayment
     */
    public boolean isPendingPayment() {
        return pendingPayment;
    }

    /**
     * @param pendingPayment the pendingPayment to set
     */
    public void setPendingPayment(boolean pendingPayment) {
        this.pendingPayment = pendingPayment;
    }

    /**
     * @return the avalible
     */
    public boolean isAvalible() {
        return avalible;
    }

    /**
     * @param avalible the avalible to set
     */
    public void setAvalible(boolean avalible) {
        this.avalible = avalible;
    }
    
    
    
    }
