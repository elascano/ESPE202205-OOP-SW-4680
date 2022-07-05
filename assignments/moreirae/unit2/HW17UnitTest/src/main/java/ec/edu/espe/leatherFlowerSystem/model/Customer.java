package ec.edu.espe.leatherFlowerSystem.model;
/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Customer {
    private String names;
    private String surnames;
    private String cellphone;
    private String ID;
    private String email;

    public Customer(String names, String surnames, String cellphone, String ID, String email) {
        this.names = names;
        this.surnames = surnames;
        this.cellphone = cellphone;
        this.ID = ID;
        this.email = email;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  names + "," + surnames + "," + cellphone + "," + ID + "," + email;
    }
    public void scheduleAppointment(){
        
    }
    public void deferAppointment(){
        
    }
    public void calcelAppointment(){
        
    }
} 
    
 
