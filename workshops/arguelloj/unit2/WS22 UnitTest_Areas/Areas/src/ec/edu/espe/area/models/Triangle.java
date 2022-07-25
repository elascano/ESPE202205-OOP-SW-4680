
package ec.edu.espe.area.models;

/**
 *
 * @author Joel Arguello, DCCO- ESPE, BettaCoders
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
    
    
    public double area(){
        double semiperimeter;
        double area;
        
        semiperimeter = (this.sideA+this.sideB+this.sideC)/2;
        
        area= Math.sqrt(semiperimeter*(semiperimeter-this.sideA)*(semiperimeter-this.sideB)*(semiperimeter-this.sideC));
        
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
