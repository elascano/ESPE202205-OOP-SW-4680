package ec.edu.espe.object.model;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE, DAMAGE SE
 */
public class Person {
    private int ID;
    private String name;
    private String course;

    public Person() {
        ID = 0;
        name = "";
        course = "";
    }

    @Override
    public String toString() {
        return "Person{" + "ID = " + ID + ", name = " + name + ", course = " + course + '}';
    }

    
    public Person(int ID, String name, String course) {
        this.ID = ID;
        this.name = name;
        this.course = course;
    }

    
    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
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
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }
           
}
