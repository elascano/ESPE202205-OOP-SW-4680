package ec.edu.espe.diamond.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class AreaD {
    private double majorDiagonal;
    private double miniorDiagonal;

    public AreaD(double majorDiagonal, double miniorDiagonal) {
        this.majorDiagonal = majorDiagonal;
        this.miniorDiagonal = miniorDiagonal;
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
