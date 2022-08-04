package ec.edu.espe.areas.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class Triangulo {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangulo(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    
    
    
    public double demostrateAreaTriangle(){
        double semiperimeter;
        double area;
        
        semiperimeter = (sideA+sideB+sideC)/2;
        
        area= Math.sqrt(semiperimeter*(semiperimeter-sideA)*(semiperimeter-sideB)*(semiperimeter-sideC));
        
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