
package ec.edu.espe.codeproject.model;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Customer {
    private int id;
    private String name;
    private String adress;
    private String numberOfcellphone;
    private String email;

    public Customer(int id, String name, String adress, String numberOfcellphone, String email) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.numberOfcellphone = numberOfcellphone;
        this.email = email;
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
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the cellPhone
     */
    public String getCellPhone() {
        return numberOfcellphone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(String cellPhone) {
        this.numberOfcellphone = cellPhone;
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
