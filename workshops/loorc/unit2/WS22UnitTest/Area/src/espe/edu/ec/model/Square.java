
package espe.edu.ec.model;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Square {
    private double SideA;
    private double SideB;

    public Square(double SideA, double SideB) {
        this.SideA = SideA;
        this.SideB = SideB;
    }
    
    public double CalculateArea(){
        double area;
        
        area = Math.sqrt(getSideA()*getSideB());
        return area;
    }

    /**
     * @return the SideA
     */
    public double getSideA() {
        return SideA;
    }

    /**
     * @param SideA the SideA to set
     */
    public void setSideA(double SideA) {
        this.SideA = SideA;
    }

    /**
     * @return the SideB
     */
    public double getSideB() {
        return SideB;
    }

    /**
     * @param SideB the SideB to set
     */
    public void setSideB(double SideB) {
        this.SideB = SideB;
    }
    
    
}
