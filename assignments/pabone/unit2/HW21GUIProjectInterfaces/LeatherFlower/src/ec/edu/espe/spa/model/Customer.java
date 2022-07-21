
package ec.edu.espe.spa.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Elkin Pabon, DCCO ESPE, DEES Developers
 */
public class Customer {
    private String name;
    private String lastName;
    private int ID;

    public Customer(String name, String lastName, int ID) {
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
    }

    public void see(){
        List<Customer> customers;
        customers = new ArrayList<>();
        
        Set<String> names;
        names = new TreeSet<>();
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
   
}
