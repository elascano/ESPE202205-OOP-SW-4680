
package espe.edu.ec.coop.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Ticket {
    
    private String routes;
    private float price;
    private float distancia;
    private String direccion;
    
    

    public Ticket(String routes, float price, float distancia, String direccion) {
        this.routes = routes;
        this.price = price;
        this.distancia = distancia;
        this.direccion = direccion;
    }
    
    
    
    
    

    /**
     * @return the routes
     */
    public String getRoutes() {
        return routes;
    }

    /**
     * @param routes the routes to set
     */
    public void setRoutes(String routes) {
        this.routes = routes;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the distancia
     */
    public float getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
