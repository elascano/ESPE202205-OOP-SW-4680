
package ec.edu.espe.CoopLatina.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Customer {


    
    private String IdentificationCard;
    private String name;
    private int number;
    private String address;

    public Customer(String IdentificationCard, String name, int number, String address) {
        this.IdentificationCard = IdentificationCard;
        this.name = name;
        this.number = number;
        this.address = address;
    }

    @Override
    public String toString() {
        return "customer{" + "" + getIdentificationCard() + ", " + getName() + ", " + getNumber() + ", " + getAddress() + '}';
    }

   
    /**
     * @return the IdentificationCard
     */
    public String getIdentificationCard() {
        return IdentificationCard;
    }

    /**
     * @param IdentificationCard the IdentificationCard to set
     */
    public void setIdentificationCard(String IdentificationCard) {
        this.IdentificationCard = IdentificationCard;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
