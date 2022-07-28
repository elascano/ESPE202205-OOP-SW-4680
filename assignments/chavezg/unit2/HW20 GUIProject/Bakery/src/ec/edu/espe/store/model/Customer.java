package ec.edu.espe.store.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Customer {
    private int id;
    private String name;
    private int phone;
    private String adrees;

    public Customer(int id, String name, int phone, String adrees) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.adrees = adrees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAdrees() {
        return adrees;
    }

    public void setAdrees(String adrees) {
        this.adrees = adrees;
    }
    
}
