
package ejercicoenclase;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Person {
     int id;
     String name;
     String course;

    public Person(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", course=" + course + '}';
    }
    

    public Person() {
        id=0;
        name="";
        course="";
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
