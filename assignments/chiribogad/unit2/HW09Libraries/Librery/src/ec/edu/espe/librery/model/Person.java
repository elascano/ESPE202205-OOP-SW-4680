package ec.edu.espe.librery.model;

/**
 *
 * @author danyc
 */
public class Person {
    private String name;
    private String course;
    private String hobbies; 

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", course=" + course + ", hobbies=" + hobbies + '}';
    }

    public Person(String name, String course, String hobbies) {
        this.name = name;
        this.course = course;
        this.hobbies = hobbies;
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

    /**
     * @return the hobbies
     */
    public String getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
