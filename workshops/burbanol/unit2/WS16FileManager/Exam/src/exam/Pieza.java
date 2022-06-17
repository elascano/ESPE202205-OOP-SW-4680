
package exam;


public class Pieza {
    private int numeroDePieza;
    private String nombre;
    private double precio;
    private int tiempo;

    public Pieza(int numeroDePieza, String nombre, double precio, int tiempo) {
        this.numeroDePieza = numeroDePieza;
        this.nombre = nombre;
        this.precio = precio;
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Pieza{" + "numeroDePieza=" + numeroDePieza + ", nombre=" + nombre + ", precio=" + precio + ", tiempo=" + tiempo + '}';
    }

    
    
    /**
     * @return the numeroDePieza
     */
    public int getNumeroDePieza() {
        return numeroDePieza;
    }

    /**
     * @param numeroDePieza the numeroDePieza to set
     */
    public void setNumeroDePieza(int numeroDePieza) {
        this.numeroDePieza = numeroDePieza;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
}
