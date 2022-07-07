package edu.espe.ec.area.model;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class Rhomboid {
    private double sideA;
    private double sideB;

    public Rhomboid(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rhomboid() {
    }

    
    public double calculateRhomboid() {
        double area;
        area = sideA*sideB;
        return area;
        
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
    
    
}
