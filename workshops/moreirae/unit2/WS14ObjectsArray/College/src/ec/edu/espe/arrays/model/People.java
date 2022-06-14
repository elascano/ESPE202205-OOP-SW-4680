
package ec.edu.espe.arrays.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class People {
    private int id;
    private String name;
    private String course;

    public People() {
        id = 0;
        name = "";
        course = "";
    }

    @Override
    public String toString() {
        return "People{" + "id=" + id + ", name=" + name + ", course=" + course + '}';
    }

    public People(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
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
