package ec.edu.espe.octagonArea.model;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES` Developers
 */

public class Octagon {
    private double perimeter;
    private double apothem;

    
    public Octagon(double perimeter, double apothem) {
        this.perimeter = perimeter;
        this.apothem = apothem;
    }

    
    public double getBase() {
        return perimeter;
    }

    public void setBase(double perimeter) {
        this.perimeter = perimeter;
    }

    
    public double getHeight() {
        return apothem;
    }

    public void setHeight(double apothem) {
        this.apothem = apothem;
    }
       
    @Override
    public String toString() {
        return "Octagon{" + "perimeter=" + perimeter + ", apothem=" + apothem + '}';
    }
    
    public double OctagonArea(){
        double area;
       
        area = ( perimeter * apothem )/2;
        return area;
    }
}
