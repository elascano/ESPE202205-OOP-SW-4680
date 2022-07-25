
package espe.edu.ec.CoopLatinaMarco.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Bus {
    private int id;
    private String matricule;
    private String nameOfDriver;
    private int route;

    @Override
    public String toString() {
        return "Bus{" + "id=" + getId() + ", matricule=" + getMatricule() + ", nameOfDriver=" + getNameOfDriver() + ", route=" + getRoute() + '}';
    }

    public Bus(int id, String matricule, String nameOfDriver, int route) {
        this.id = id;
        this.matricule = matricule;
        this.nameOfDriver = nameOfDriver;
        this.route = route;
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
     * @return the matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule to set
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * @return the nameOfDriver
     */
    public String getNameOfDriver() {
        return nameOfDriver;
    }

    /**
     * @param nameOfDriver the nameOfDriver to set
     */
    public void setNameOfDriver(String nameOfDriver) {
        this.nameOfDriver = nameOfDriver;
    }

    /**
     * @return the route
     */
    public int getRoute() {
        return route;
    }

    /**
     * @param route the route to set
     */
    public void setRoute(int route) {
        this.route = route;
    }

    public Object getid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getmatricule() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getnameOfDriver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getroute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
