package ec.edu.espe.fruteri.model;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class Customer {
  private int id;
    private String fullName;
    private String email;
    private String type;
    private int age;
   private float totalSale;

    public Customer(int id, String fullName, String email, String type, int age, float totalSale) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.type = type;
        this.age = age;
        this.totalSale=totalSale;
    }

    public float getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(float totalSale) {
        this.totalSale = totalSale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
   
}
