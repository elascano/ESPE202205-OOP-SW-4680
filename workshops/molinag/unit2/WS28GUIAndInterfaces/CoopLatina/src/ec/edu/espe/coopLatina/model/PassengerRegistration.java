package ec.edu.espe.coopLatina.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class PassengerRegistration {
    private int id;
    private String name;
    private String email;
    private float pay;

    public PassengerRegistration(int id, String name, String email, float pay) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pay = pay;
    }
    
    public void see(){
        List<PassengerRegistration> passengerRegistration;
        passengerRegistration = new ArrayList<>();

        Set<String> names;
        names = new TreeSet<>();
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
     * @return the pay
     */
    public float getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(float pay) {
        this.pay = pay;
    }
    
    
    
}
