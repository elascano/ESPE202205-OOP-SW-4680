package ec.edu.espe.food.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Customer {
    private String Name;
    private int Id;
    private String Email;
    private int Phone;
    private int Age;
    private int Password;

    public Customer(String Name, int Id, String Email, int Phone, int Age, int Password) {
        this.Name = Name;
        this.Id = Id;
        this.Email = Email;
        this.Phone = Phone;
        this.Age = Age;
        this.Password = Password;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Phone
     */
    public int getPhone() {
        return Phone;
    }

    /**
     * @param Phone the Phone to set
     */
    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @return the Password
     */
    public int getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(int Password) {
        this.Password = Password;
    }

}
