package ec.edu.espe.FruitApp.model;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class Client {
     private String name;
     private String id;
     private int age;

    public Client(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        
    }

    public Client() {
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", id=" + id + ", age=" + age + '}';
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
     

}