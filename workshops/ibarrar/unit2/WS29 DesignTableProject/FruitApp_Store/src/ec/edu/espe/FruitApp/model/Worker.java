package ec.edu.espe.fruitApp.model;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class Worker {
     private String name;
     private String id;
     private int age;
     private String cellPhone;
     private String email;

    public Worker(String name, String id, int age, String cellPhone, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.cellPhone = cellPhone;
        this.email = email;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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