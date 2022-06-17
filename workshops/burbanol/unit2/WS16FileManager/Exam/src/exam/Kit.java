
package exam;

import java.util.ArrayList;


public class Kit {
    private String nombre;
    private int numero;
    private double tiempoManoDeObra;
    private ArrayList<Pieza> piezas;
    private double precio;
    private double tiempoKit;

    public Kit(String nombre, int numero, double tiempoManoDeObra, ArrayList<Pieza> piezas) {
        this.nombre = nombre;
        this.numero = numero;
        this.tiempoManoDeObra = tiempoManoDeObra;
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return "Kit{" + "nombre=" + nombre + ", numero=" + numero + ", tiempoManoDeObra=" + tiempoManoDeObra + ", pieza=" + piezas + '}';
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
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the tiempoManoDeObra
     */
    public double getTiempoManoDeObra() {
        return tiempoManoDeObra;
    }

    /**
     * @param tiempoManoDeObra the tiempoManoDeObra to set
     */
    public void setTiempoManoDeObra(double tiempoManoDeObra) {
        this.tiempoManoDeObra = tiempoManoDeObra;
    }

    /**
     * @return the piezas
     */
    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    /**
     * @param piezas the piezas to set
     */
    public void setPiezas(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
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
     * @return the tiempoKit
     */
    public double getTiempoKit() {
        return tiempoKit;
    }

    /**
     * @param tiempoKit the tiempoKit to set
     */
    public void setTiempoKit(double tiempoKit) {
        this.tiempoKit = tiempoKit;
    }
    
    
    
}
