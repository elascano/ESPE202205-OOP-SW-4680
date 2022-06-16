package ec.edu.espe.FruitApp.model;

/**
 *
 * @author Carlos Granda,Ronny Ibarra,Jose Imbaquinga, DCCO-ESPE, Syntax Error
 */
public class Client {
    private String name;
    private String id;
    private int age;

    public Client() {
    }

    public Client(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", id=" + id + ", age=" + age + '}';
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
}
