
package ec.edu.espe.area.model;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Heptagon {
    
    double apothem;
    int side;

    public Heptagon(double apothem, int side) {
        this.apothem = apothem;
        this.side = side;
    }

    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        this.apothem = apothem;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
    
    
    
public double areaCalculator() {
    double perimeter;
    double area;
        
     perimeter = (7*side);
     
     area = (perimeter * apothem)/2;
     
        return area;
}
     
}
