package ec.edu.espe.coopLatina.model;

/**
 *
 * @author Mendoza Mateo, DCCO-ESPE GADC.msi
 */
public class Passenger {
    
    private String name;
    private String address;
    private String email;
    private String cellPhone;
    private float payment;

    public Passenger(String name, String addres, String email, String cellPhone, float payment) {
        this.name = name;
        this.address = addres;
        this.email = email;
        this.cellPhone = cellPhone;
        this.payment = payment;
    }

    public Passenger(String steven_Molina, String string, String stevegmailcom, float f) {
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
     * @return the cellPhone
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * @return the payment
     */
    public float getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(float payment) {
        this.payment = payment;
    }
    
    
}
