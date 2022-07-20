
package espe.edu.ec.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Point {
    
    private int coordinateX;
    private int coordinateY; 

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    /**
     * @return the coordinateX
     */
    public int getCoordinateX() {
        return coordinateX;
    }

    /**
     * @param coordinateX the coordinateX to set
     */
    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    /**
     * @return the coordinateY
     */
    public int getCoordinateY() {
        return coordinateY;
    }

    /**
     * @param coordinateY the coordinateY to set
     */
    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
    
    
}
