
package ec.edu.espe.areas.model;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    
     public double computeArea()
    {
    double area;
    double semiPerimeter;
    semiPerimeter =(sideA+sideB+sideC)/2;
    area =(double)Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
    return area;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * @return the sideA
     */
    public double getSideA() {
        return sideA;
    }

    /**
     * @param sideA the sideA to set
     */
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    /**
     * @return the sideB
     */
    public double getSideB() {
        return sideB;
    }

    /**
     * @param sideB the sideB to set
     */
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    /**
     * @return the sideC
     */
    public double getSideC() {
        return sideC;
    }

    /**
     * @param sideC the sideC to set
     */
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

}
