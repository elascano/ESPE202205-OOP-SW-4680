
package ec.espe.edu.test.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Animal {
    private int id;
    private int age;
    private String name;

    public Animal() {
        id = 0;
        age = 0;
        name = "";
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", age=" + age + ", name=" + name + '}';
    }

    
    
    public Animal(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
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
    
}
