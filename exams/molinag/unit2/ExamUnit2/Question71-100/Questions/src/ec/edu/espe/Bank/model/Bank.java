
package ec.edu.espe.Bank.model;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class Bank {
    private String name;
    private String id;
    private String located;
    private String dateOfFundation;
    private int numberOfCustomers;

    public Bank() {
    }
   
    @Override
    public String toString() {
        return "Bank{" + "name=" + name + ", id=" + id + ", located=" + located + ", dateOfFundation=" + dateOfFundation + ", numberOfCustomers=" + numberOfCustomers + '}';
    }

    
    public Bank(String name, String id, String located, String dateOfFundation, int numberOfCustomers) {
        this.name = name;
        this.id = id;
        this.located = located;
        this.dateOfFundation = dateOfFundation;
        this.numberOfCustomers = numberOfCustomers;
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the located
     */
    public String getLocated() {
        return located;
    }

    /**
     * @param located the located to set
     */
    public void setLocated(String located) {
        this.located = located;
    }

    /**
     * @return the dateOfFundation
     */
    public String getDateOfFundation() {
        return dateOfFundation;
    }

    /**
     * @param dateOfFundation the dateOfFundation to set
     */
    public void setDateOfFundation(String dateOfFundation) {
        this.dateOfFundation = dateOfFundation;
    }

    /**
     * @return the numberOfCustomers
     */
    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    /**
     * @param numberOfCustomers the numberOfCustomers to set
     */
    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }
    
    
}
