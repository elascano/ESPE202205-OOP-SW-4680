package ec.edu.espe.codeproject.model;

import java.util.Scanner;

/**
 * @author Daniela Tituaña, DCCO - ESPE,MyWayCode
 */
public class Cashier {
    private String id;
    private String cellPhone;
    private String name;
    private String adress; 
    private String email;
    private String user; 
    private String password;
    

    public Cashier(String id, String cellPhone, String name, String adress, String email, String user, String password) {
        this.id = id;
        this.cellPhone = cellPhone;
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.user = user;
        this.password = password;
    }


    public Cashier(String id, String name, String address, String numberOfcellphone, String email) {
        }

    public Cashier() {
        
        }

    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the CellPhone
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * @param CellPhone the CellPhone to set
     */
    public void setCellPhone(String CellPhone) {
        this.cellPhone = CellPhone;
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
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }}
    
    
   
  
    
   