
package edu.espe.ec.testareacube.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Cube {
    private double aSide;
    private double area;

    public Cube(double aSide, double area) {
        this.aSide = aSide;
        this.area = area;
    }
    

    /**
     * @return the aSide
     */
    public double getaSide() {
        return aSide;
    }

    /**
     * @param aSide the aSide to set
     */
    public void setaSide(double aSide) {
        this.aSide = aSide;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
}
