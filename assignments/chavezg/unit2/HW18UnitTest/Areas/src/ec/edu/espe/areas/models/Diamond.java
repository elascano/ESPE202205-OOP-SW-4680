package ec.edu.espe.areas.models;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE, DAMAGE SE
 */
public class Diamond {
    private double majorDiagonal;
    private double miniorDiagonal;

    public Diamond(double majorDiagonal, double miniorDiagonal) {
        this.majorDiagonal = majorDiagonal;
        this.miniorDiagonal = miniorDiagonal;
    }

    public double calculateAread(){
        double area;
        double semiperimeter;

        semiperimeter = ((this.majorDiagonal*this.miniorDiagonal)/2);
        area= Math.sqrt(semiperimeter*(semiperimeter-this.majorDiagonal)*(semiperimeter-this.miniorDiagonal));

        return area;
    }
    
    public double getMajorDiagonal() {
        return majorDiagonal;
    }

    public void setMajorDiagonal(double majorDiagonal) {
        this.majorDiagonal = majorDiagonal;
    }

    public double getMiniorDiagonal() {
        return miniorDiagonal;
    }

    public void setMiniorDiagonal(double miniorDiagonal) {
        this.miniorDiagonal = miniorDiagonal;
    }
    
    
}
