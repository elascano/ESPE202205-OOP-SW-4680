package ec.edu.espe.fruit.model;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class Customer {
  private String name;
  private int id;
  private int age;
  private String type;
  private float discount;

    public Customer() {
    }

    public Customer(String name, int id, int age, String type, float discount) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.type = type;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", id=" + id + ", age=" + age + ", type=" + type + ", discount=" + discount + '}';
    }
  
}
