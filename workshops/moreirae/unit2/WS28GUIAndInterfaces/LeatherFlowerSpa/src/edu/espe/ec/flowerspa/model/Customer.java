
package edu.espe.ec.flowerspa.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Customer {
   private String Id;
   private String name;
   private String eMail;

    public Customer(String Id, String name, String eMail) {
        this.Id = Id;
        this.name = name;
        this.eMail = eMail;
    }

   
   public void see(){
       List<Customer> customers;
       customers = new ArrayList<>();
           
       Set<String> names;
       names = new TreeSet<>();
   }
    /**
     * @return the Id
     */
   
   
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
