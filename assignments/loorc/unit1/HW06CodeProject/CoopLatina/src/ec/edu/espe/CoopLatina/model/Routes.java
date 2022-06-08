
package ec.edu.espe.CoopLatina.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Routes {
    
    
    private String nameRoute;
    private int idRoute;
    private boolean availableRoute;
    private int distanceKm;

    public Routes(String nameRoute, int idRoute, boolean availableRoute, int distanceKm) {
        this.nameRoute = nameRoute;
        this.idRoute = idRoute;
        this.availableRoute = availableRoute;
        this.distanceKm = distanceKm;
    }

    @Override
    public String toString() {
        return "Routes{" + "nameRoute=" + nameRoute + ", idRoute=" + idRoute + ", availableRoute=" + availableRoute + ", distanceKm=" + distanceKm + '}';
    }

    
    
    
    /**
     * @return the nameRoute
     */
    public String getNameRoute() {
        return nameRoute;
    }

    /**
     * @param nameRoute the nameRoute to set
     */
    public void setNameRoute(String nameRoute) {
        this.nameRoute = nameRoute;
    }

    /**
     * @return the idRoute
     */
    public int getIdRoute() {
        return idRoute;
    }

    /**
     * @param idRoute the idRoute to set
     */
    public void setIdRoute(int idRoute) {
        this.idRoute = idRoute;
    }

    /**
     * @return the availableRoute
     */
    public boolean isAvailableRoute() {
        return availableRoute;
    }

    /**
     * @param availableRoute the availableRoute to set
     */
    public void setAvailableRoute(boolean availableRoute) {
        this.availableRoute = availableRoute;
    }

    /**
     * @return the distanceKm
     */
    public int getDistanceKm() {
        return distanceKm;
    }

    /**
     * @param distanceKm the distanceKm to set
     */
    public void setDistanceKm(int distanceKm) {
        this.distanceKm = distanceKm;
    }
    
    
    
}
