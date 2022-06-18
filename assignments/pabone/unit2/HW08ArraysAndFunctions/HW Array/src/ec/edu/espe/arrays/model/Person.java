package ec.edu.espe.arrays.model;

/**
 * @author Elkin Pabon, DCCO ESPE, DEES Developers
 */

public class Person {
    private int number;
    private String name;
    

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person=" + "name=" + name + ", number=" + number ;
    }
    
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
 
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }     
}
