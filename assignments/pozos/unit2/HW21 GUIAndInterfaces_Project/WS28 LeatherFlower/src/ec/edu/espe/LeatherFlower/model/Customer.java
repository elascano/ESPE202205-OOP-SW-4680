
package ec.edu.espe.LeatherFlower.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Customer {
    private String id;
    private String names;
    private String surnames;
    private String cellphone;
    private String email;

    public Customer(String id, String names, String surnames, String cellphone, String email) {
        this.id = id;
        this.names = names;
        this.surnames = surnames;
        this.cellphone = cellphone;
        this.email = email;
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
     * @return the names
     */
    public String getNames() {
        return names;
    }

    /**
     * @param names the names to set
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * @return the surnames
     */
    public String getSurnames() {
        return surnames;
    }

    /**
     * @param surnames the surnames to set
     */
    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    /**
     * @return the cellphone
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
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
    public void see(){
        List<Customer> customers;
        customers = new ArrayList<>();
        
        Set<String> names;
        names= new TreeSet<>();
    }
}
