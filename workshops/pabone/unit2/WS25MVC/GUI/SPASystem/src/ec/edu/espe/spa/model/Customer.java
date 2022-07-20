package ec.edu.espe.spa.model;

/**
 *
 * @author Elkin Pabon, DCCO ESPE, DEES Developers
 */

public class Customer {
    
  private String name;
  private String lastName;
  private int id;
  private int cellphone;
  private String typeOfService;
 

    public Customer(String name, String lastName, int id, int cellphone, String typeOfService) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.cellphone = cellphone;
        this.typeOfService = typeOfService;
       
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
     * @return the cellphone
     */
    public int getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * @return the typeOfService
     */
    public String getTypeOfService() {
        return typeOfService;
    }

    /**
     * @param typeOfService the typeOfService to set
     */
    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }
 
}
