
package ec.edu.espe.CoopLatina.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Passage {
    
    private String name;
    private String addres;
    private int number;
    private int pendingPayment;

    public Passage(String name, String addres, int number, int pendingPayment) {
        this.name = name;
        this.addres = addres;
        this.number = number;
        this.pendingPayment = pendingPayment;
    }

    @Override
    public String toString() {
        return "Passage{" + "name=" + name + ", addres=" + addres + ", number=" + number + ", pendingPayment=" + pendingPayment + '}';
    }
    
    
    
    
    public void Pay(){

    
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
     * @return the addres
     */
    public String getAddres() {
        return addres;
    }

    /**
     * @param addres the addres to set
     */
    public void setAddres(String addres) {
        this.addres = addres;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the pendingPayment
     */
    public int getPendingPayment() {
        return pendingPayment;
    }

    /**
     * @param pendingPayment the pendingPayment to set
     */
    public void setPendingPayment(int pendingPayment) {
        this.pendingPayment = pendingPayment;
    }
    
    
    
}
