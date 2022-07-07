package edu.espe.ec.area.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, Codex++
 */
public class Parallelogram {
    private double base;
    private double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Parallelogram() {
    }

    
    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
}

 