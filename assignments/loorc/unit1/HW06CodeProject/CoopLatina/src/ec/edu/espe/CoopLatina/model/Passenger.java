
package ec.edu.espe.CoopLatina.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Passenger {
    private String name;
    private int numberPassegner;
    private boolean pendingPayment;

    public Passenger(String name, int numberPassegner, boolean pendingPayment) {
        this.name = name;
        this.numberPassegner = numberPassegner;
        this.pendingPayment = pendingPayment;
    }

    @Override
    public String toString() {
        return "Passenger{" + "name=" + name + ", numberPassegner=" + numberPassegner + ", pendingPayment=" + pendingPayment + '}';
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
     * @return the numberPassegner
     */
    public int getNumberPassegner() {
        return numberPassegner;
    }

    /**
     * @param numberPassegner the numberPassegner to set
     */
    public void setNumberPassegner(int numberPassegner) {
        this.numberPassegner = numberPassegner;
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
    
}
