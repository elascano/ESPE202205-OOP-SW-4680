package ec.edu.espe.university.model;

//import java.util.logging.Logger;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class University {
    
    private String name;
    private int year;
    private String place;
    private String type;

    public University() {
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    public University(String name, int year, String place, String type) {
        this.name = name;
        this.year = year;
        this.place = place;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Singer{" + "name=" + name + ", year=" + year + ", place=" + place + ", type=" + type + '}';
    }
 
    
}
