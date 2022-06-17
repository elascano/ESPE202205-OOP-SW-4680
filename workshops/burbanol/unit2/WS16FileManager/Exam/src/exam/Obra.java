
package exam;

import java.util.ArrayList;


public class Obra {
    private int numeroDeObra;
    private String nombre;
    private double precio;
    private double tiempo;
    private ArrayList<Kit> kits;

    public Obra(int numeroDeObra, String nombre, double precio, double tiempo, ArrayList<Kit> kits) {
        this.numeroDeObra = numeroDeObra;
        this.nombre = nombre;
        this.precio = precio;
        this.tiempo = tiempo;
        this.kits = kits;
    }

    @Override
    public String toString() {
        return "Obra{" + "numeroDeObra=" + numeroDeObra + ", nombre=" + nombre + ", precio=" + precio + ", tiempo=" + tiempo + ", kits=" + kits + '}';
    }
    
    
    
    /**
     * @return the numeroDeObra
     */
    public int getNumeroDeObra() {
        return numeroDeObra;
    }

    /**
     * @param numeroDeObra the numeroDeObra to set
     */
    public void setNumeroDeObra(int numeroDeObra) {
        this.numeroDeObra = numeroDeObra;
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
    public double getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the kits
     */
    public ArrayList<Kit> getKits() {
        return kits;
    }

    /**
     * @param kits the kits to set
     */
    public void setKits(ArrayList<Kit> kits) {
        this.kits = kits;
    }
    
    
    
}
