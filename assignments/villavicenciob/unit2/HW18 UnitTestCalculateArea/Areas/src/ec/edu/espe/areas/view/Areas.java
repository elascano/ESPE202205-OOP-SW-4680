
package ec.edu.espe.areas.view;
import java.util.Scanner;
import ec.edu.espe.areas.model.Rectangle;
import ec.edu.espe.areas.model.Triangle;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class Areas {


    public static void main(String[] args) {
        
        
//        Triangle triangle;
//        double area;
//        triangle = new Triangle();
//        area= triangle.calculateArea();
//        System.out.println("Area of a triangle");
//        System.out.println(area);
        
        Rectangle rectangule;
        double areaR;
        rectangule = new Rectangle();
        
     
        areaR= rectangule.calculateAreaRc();
        System.out.println("area of a rectangule");
        System.out.println(areaR);
    }
}
