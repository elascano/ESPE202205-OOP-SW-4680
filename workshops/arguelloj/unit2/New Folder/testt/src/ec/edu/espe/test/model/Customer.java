package ec.edu.espe.test.model;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class Customer {
    
    public int id;
    public String fullName;
    public String email;
    public String type;
    public float discount;
    float totalSale;

    public Customer(int id, String fullName, String email, String type, float discount) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.type = type;
        this.discount = discount;
       
    }

    /**
     * @return the id
     */
    private int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    private void setId(int id) {
        this.id = id;
    }

    /**
     * @return the fullName
     */
    private String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    private void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the email
     */
    private String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    private void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the type
     */
    private String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    private void setType(String type) {
        this.type = type;
    }

    /**
     * @return the discount
     */
    private float getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    private void setDiscount(float discount) {
        this.discount = discount;
    }
    
    
    
}
