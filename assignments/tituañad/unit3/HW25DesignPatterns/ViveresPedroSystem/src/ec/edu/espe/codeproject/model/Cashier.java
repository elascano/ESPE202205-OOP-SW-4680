package ec.edu.espe.codeproject.model;


import org.bson.Document;

/**
 * @author Daniela Tituaña, DCCO - ESPE,MyWayCode
 */
public class Cashier extends Abstract {
    private int _id;
    private int cellphone;
    private String name;
    private String adress; 
    private String email;
    

    public Cashier() {
    }
        
    
    public Cashier(int identification, int cellphone, String name, String adress, String email, String user, String password) {
        this._id = identification;
        this.cellphone = cellphone;
        this.name = name;
        this.adress = adress;
        this.email = email;
      
    }

    @Override
    public String toString() {
        return "Cashier{" + "_id=" + _id + ", cellphone=" + cellphone + ", name=" + name + ", adress=" + adress + ", email=" + email + '}';
    }


   /* public Cashier(int _id, String name, String address, String numberOfcellphone, String email) {
        }*/

    /**
     * @return the _id
     */
    
    public int getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     * @return the CellPhone
     */
    public int getCellPhone() {
        return cellphone;
    }

    /**
     * @param CellPhone the CellPhone to set
     */
    public void setCellPhone(int CellPhone) {
        this.cellphone = CellPhone;
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
    @Override
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
     * @return the user
     */
   

    @Override
    public Document buildDocument() {
        return null;
        }
}
    
    
   
  
    
   