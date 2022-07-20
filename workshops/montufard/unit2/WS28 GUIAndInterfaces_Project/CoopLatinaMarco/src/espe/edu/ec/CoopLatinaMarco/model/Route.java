package espe.edu.ec.CoopLatinaMarco.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Route {
    private String nameRoute;
    private int idRoute;
    private int distanceKm;
    private float priceOfRoute;
    private boolean avalibleRoute;

    public Route(String nameRoute, int idRoute, int distanceKm, float priceOfRoute, boolean avalibleRoute) {
        this.nameRoute = nameRoute;
        this.idRoute = idRoute;
        this.distanceKm = distanceKm;
        this.priceOfRoute = priceOfRoute;
        this.avalibleRoute = avalibleRoute;
    }

    public Route(String marianas, String string, String km, float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Route() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Routes{" + "nameRoute=" + nameRoute + ", idRoute=" + idRoute + ", distanceKm=" + distanceKm + ", priceOfRoute=" + priceOfRoute + ", avalibleRoute=" + avalibleRoute + '}';
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

    /**
     * @return the priceOfRoute
     */
    public float getPriceOfRoute() {
        return priceOfRoute;
    }

    /**
     * @param priceOfRoute the priceOfRoute to set
     */
    public void setPriceOfRoute(float priceOfRoute) {
        this.priceOfRoute = priceOfRoute;
    }

    /**
     * @return the avalibleRoute
     */
    public boolean isAvalibleRoute() {
        return avalibleRoute;
    }

    /**
     * @param avalibleRoute the avalibleRoute to set
     */
    public void setAvalibleRoute(boolean avalibleRoute) {
        this.avalibleRoute = avalibleRoute;
    }

   
}
