package ec.edu.espe.utils.json;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES Developers
 */

public class Person {
    private int id;
    private String course;
    private String name;
    

    public Person(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person\n" + "id = " + id + ", Name = " + name + ", Course = " + course + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }  
}
