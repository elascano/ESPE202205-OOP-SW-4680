package ec.edu.espe.cooplatina.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author David Montufar, DCCO-ESPE GADC.msi
 */
public class Customer {

    private int id;

    public Customer(int id, String name, float cellphone) {
        this.id = id;
        this.name = name;
        this.cellphone = cellphone;
    }
    
    public void see(){
    List<Customer>customers;
    customers=new ArrayList<>();

    Set<String>names;
    names=new TreeSet<>();
    
    }

    private String name;
    private float cellphone;

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
     * @return the cellphone
     */
    public float getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(float cellphone) {
        this.cellphone = cellphone;
    }

}
