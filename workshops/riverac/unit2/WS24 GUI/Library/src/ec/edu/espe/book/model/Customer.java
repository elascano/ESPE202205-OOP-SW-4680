package ec.edu.espe.book.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Customer {
    private String name;
    private int id;
    private String email;
    private int phone;

    public Customer(String name, int id, String email, int phone, int age) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    public Customer(String name, int id, String email, int phone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }
}
