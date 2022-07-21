
package ec.edu.espe.beutifyapp.model;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Stylist {

    private int id;
    private String name;
    private String address;
    private String appointment;
    private float salary;

    public Stylist(int id, String name, String address, String appointment, float salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.appointment = appointment;
        this.salary = salary;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    

    
}
