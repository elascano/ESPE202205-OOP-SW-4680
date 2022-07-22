package ec.edu.espe.arrayprim.model;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE, DAMAGE SE 
 */
public class People {
    private String name;
    private int number;

    public People(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "name = " + name + ", number = " + number;
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
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
}

