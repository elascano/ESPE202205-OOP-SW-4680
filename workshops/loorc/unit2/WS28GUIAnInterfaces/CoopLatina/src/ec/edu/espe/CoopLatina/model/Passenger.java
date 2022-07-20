
package ec.edu.espe.CoopLatina.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Passenger {
    private int identificaton;
    private String name;
    private String email;

    public Passenger(int identificaton, String name, String email) {
        this.identificaton = identificaton;
        this.name = name;
        this.email = email;
    }
    
    public void see(){
        List<Passenger> passenger;
        passenger = new ArrayList<>();
        
        
        Set<String> names;
        names = new TreeSet<>();
        
        
        
    }
    

    /**
     * @return the identificaton
     */
    public int getIdentificaton() {
        return identificaton;
    }

    /**
     * @param identificaton the identificaton to set
     */
    public void setIdentificaton(int identificaton) {
        this.identificaton = identificaton;
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
    
}
