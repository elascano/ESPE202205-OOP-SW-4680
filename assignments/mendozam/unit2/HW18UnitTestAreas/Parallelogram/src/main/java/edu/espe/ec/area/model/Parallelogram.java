
package edu.espe.ec.area.model;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class Parallelogram 
{
    private double base;
    private double height;
    
    public Parallelogram (double base, double height) 
    {
        this.base = base;
        this.height = height;
    }
    
    public double calculateParallelogram() 
    {
        double area;
        area = base*height;
        return area;
        
    }

    /**
     * @return the base
     */
    public double getbase() 
    {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setbase(double base) 
    {
        this.base = base;
    }

    /**
     * @return the height
     */
    public double getheight() 
    {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setSideB(double height) 
    {
        this.height = height;
    }
    
}
