package ec.edu.espe.store.model;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class Costumer {
    public String name;
    public String email;

    public Costumer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    

    /**
     * @return the name
     */
    private String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    private void setName(String name) {
        this.name = name;
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
    
}
