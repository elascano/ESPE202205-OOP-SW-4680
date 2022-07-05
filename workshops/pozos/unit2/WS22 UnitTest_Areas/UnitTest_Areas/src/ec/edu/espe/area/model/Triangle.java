
package ec.edu.espe.area.model;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
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

    public Triangle() {
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
        public double calculateAre(double sideA,double sideB,double sideC){
        double h;
        double area;
        
        if(sideA==sideB && sideB==sideC){
            area=(Math.sqrt(3)/4)*Math.pow(sideA,2);
            return area;
        }
        if(sideA==sideB && sideB!=sideC){
            area=(sideC*Math.sqrt(Math.pow(sideA,2)-(Math.pow(sideC, 2)/4)))/2;
            return area;
        }
        
       // return area;
        return 0;
    }
    
    
}

    
