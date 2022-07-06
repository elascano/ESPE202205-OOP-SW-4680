package edu.espe.ec.area.model;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES` Developers
 */

public class Area {

    public static double area(double side1, double side2, double side3){
        
        double s, actual;
        double perimeter, area;
        side1 = 4.3;
        side2 = 3.4;
        side3 = 5.2;
        perimeter = side1 + side2 + side3;
        s = perimeter/2;
        area = (s*(s-side1)) * (s-side2) * (s-side3);
        actual = (float) (Math.pow(area, 0.5));
        
        return actual;       
    }  
}
