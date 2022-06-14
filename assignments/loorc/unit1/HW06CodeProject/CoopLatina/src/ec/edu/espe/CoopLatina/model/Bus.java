
package ec.edu.espe.CoopLatina.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Bus {
    
    private String matricule;
    private String nameChofer;
    private int route;
    private float dailyGain;

    public Bus(String matricule, String nameChofer, int route, float dailyGain) {
        this.matricule = matricule;
        this.nameChofer = nameChofer;
        this.route = route;
        this.dailyGain = dailyGain;
    }

    @Override
    public String toString() {
        return "Bus{" + "matricule=" + matricule + ", nameChofer=" + nameChofer + ", route=" + route + ", dailyGain=" + dailyGain + '}';
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
     * @return the nameChofer
     */
    public String getNameChofer() {
        return nameChofer;
    }

    /**
     * @param nameChofer the nameChofer to set
     */
    public void setNameChofer(String nameChofer) {
        this.nameChofer = nameChofer;
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

    /**
     * @return the dailyGain
     */
    public float getDailyGain() {
        return dailyGain;
    }

    /**
     * @param dailyGain the dailyGain to set
     */
    public void setDailyGain(float dailyGain) {
        this.dailyGain = dailyGain;
    }
    
    
    
}
