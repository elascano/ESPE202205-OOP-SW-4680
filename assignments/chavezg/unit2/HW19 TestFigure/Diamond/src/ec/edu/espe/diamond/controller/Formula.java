package ec.edu.espe.diamond.controller;

import ec.edu.espe.diamond.model.AreaD;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE, DAMAGE SE
 */
public class Formula {
    
    public double calculateAreaD(double majorDiagonal, double miniorDiagonal) {
        double area;
        AreaD areaD;
        
        area = (majorDiagonal*miniorDiagonal)/2;
        areaD = new AreaD(majorDiagonal, miniorDiagonal);
        
        return area;

    }

}
