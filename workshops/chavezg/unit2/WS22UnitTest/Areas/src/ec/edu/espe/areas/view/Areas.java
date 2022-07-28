package ec.edu.espe.areas.view;

import ec.edu.espe.areas.models.Triangle;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Areas {
    public static void main(String[] args) {
        double area1;
        double area2;
        double area3;
        Triangle triangle;
        
        triangle = new Triangle(4, 3, 5);
        area1 = triangle.calculateArea();
        
        triangle = new Triangle(5, 5, 5);
        area2 = triangle.calculateArea();
        
        triangle = new Triangle(4.3, 3.4, 3);
        area3 = triangle.calculateArea();
        
        System.out.println("Area ->" + area1);
        System.out.println("Area ->" + area2);
        System.out.println("Area ->" + area3);
    }

}
