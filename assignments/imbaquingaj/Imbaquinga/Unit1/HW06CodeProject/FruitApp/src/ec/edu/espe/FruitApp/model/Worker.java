package ec.edu.espe.FruitApp.model;

/**
 *
 * @author Carlos Granda,Ronny Ibarra,Jose Imbaquinga, DCCO-ESPE, Syntax Error
 */
public class Worker {
    private String name;
    private String id;
    private int age;
    private int cellphone;
    private String email;

    public Worker() {
    }

    public Worker(String name, String id, int age, int cellphone, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.cellphone = cellphone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", id=" + id + ", age=" + age + ", cellphone=" + cellphone + ", email=" + email + '}';
    }
    
    
}
