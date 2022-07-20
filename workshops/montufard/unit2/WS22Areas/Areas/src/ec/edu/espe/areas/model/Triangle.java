
package ec.edu.espe.areas.model;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.msi
 */
public class Triangle {
    
    private double sideA;
    private double sideB;
    private double sideC;
    

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    
    public double calculateArea(){
        double semiPerimeter;
        double area;
        
        semiPerimeter = (sideA+sideB+sideC)/2;
        
        area= Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
        
        return area;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    
    
    
}
