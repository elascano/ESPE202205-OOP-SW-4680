package ec.edu.espe.areas.view;

import ec.edu.espe.areas.models.Diamond;
import ec.edu.espe.areas.models.Triangle;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE, DAMAGE SE
 */
public class Areas {
    public static void main(String[] args) {
        double area1;
        double area2;
        double area3;
        double area4;
        double area5;
        double area6;
        
        Triangle triangle;
        Diamond diamond;
        
        triangle = new Triangle(4, 3, 5);
        area1 = triangle.calculateArea();
        System.out.println("area -> " + area1);
        
        triangle = new Triangle(5, 5, 5);
        area2 = triangle.calculateArea();
        System.out.println("area -> " + area2);
        
        triangle = new Triangle(4.3, 3.4, 3);
        area3 = triangle.calculateArea();
        System.out.println("area -> " + area3);
        
        diamond = new Diamond(30, 16);
        area4 = diamond.calculateAread();
        System.out.println("Area -> " + area4);
        
        diamond = new Diamond(35, 18);
        area5 = diamond.calculateAread();
        System.out.println("Area -> " + area5);
        
        diamond = new Diamond(25.6, 12.2);
        area5 = diamond.calculateAread();
        System.out.println("Area -> " + area5);

    }

}
