
package ec.edu.espe.cellphone.model;

/**
 *
 * @author David Montufar, DCCO- ESPE, GADC.MSI
 */
public class Customer {
    private int id;
    private String fullName;
    private String email;
    private String type;
    private float discout;

    public Customer(int id, String fullName, String email, String type, float discout) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.type = type;
        this.discout = discout;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the discout
     */
    public float getDiscout() {
        return discout;
    }

    /**
     * @param discout the discout to set
     */
    public void setDiscout(float discout) {
        this.discout = discout;
    }

  
    
    
}
