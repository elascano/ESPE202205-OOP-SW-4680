
package edu.espe.ec.areas.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Cube {
    private double aSideArea;
    private double cubeSides = 6;

    public Cube (double aSideArea){
    this.aSideArea = aSideArea;
    }
    /**
     * @return the aSideArea
     */
    public double getaSideArea() {
        return aSideArea;
    }

    /**
     * @param aSideArea the aSideArea to set
     */
    public void setaSideArea(double aSideArea) {
        this.aSideArea = aSideArea;
    }

    /**
     * @return the cubeSides
     */
    public double getCubeSides() {
        return cubeSides;
    }

    /**
     * @param cubeSides the cubeSides to set
     */
    public void setCubeSides(double cubeSides) {
        this.cubeSides = cubeSides;
    }

   public double calculateCubeArea(){
       double area;
       double aSideArea2;
       aSideArea2 = aSideArea * aSideArea;
       area = aSideArea2 * cubeSides;
        return area;
   }
}
