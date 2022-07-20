
package ec.edu.espe.aquation.model;

/**
 *
 * @author David Montufar, DCCO- ESPE, BettaCoders
 */
public class Point {
     private int coordenateX;
     private int coordenateY;

    public Point(int coordenateX, int coordenateY) {
        this.coordenateX = coordenateX;
        this.coordenateY = coordenateY;
    }

    @Override
    public String toString() {
        return "Point{" + "coordenateX=" + coordenateX + ", coordenateY=" + coordenateY + '}';
    }
    

    /**
     * @return the coordenateX
     */
    public int getCoordenateX() {
        return coordenateX;
    }

    /**
     * @param coordenateX the coordenateX to set
     */
    public void setCoordenateX(int coordenateX) {
        this.coordenateX = coordenateX;
    }

    /**
     * @return the coordenateY
     */
    public int getCoordenateY() {
        return coordenateY;
    }

    /**
     * @param coordenateY the coordenateY to set
     */
    public void setCoordenateY(int coordenateY) {
        this.coordenateY = coordenateY;
    }
    
   
}
