
package ec.edu.espe.area.view;

import ec.edu.espe.area.models.Triangle;
import java.util.Scanner;

/**
 *
 * @author Steven Pozo, DCCO- ESPE, BettaCoders
 */
public class Areas {


    public static void main(String[] args) {
        double area;
        double sideA;
        double sideB;
        double sideC;
        
        Triangle triangle;
        
//        triangle = new Triangle(4, 4, 3);
//        area=triangle.area();
//        System.out.println(area);
//        triangle = new Triangle(5, 5, 5);
//        area=triangle.area();
//        System.out.println(area);
//        triangle = new Triangle(4.3, 4.4, 5.2);
//        area=triangle.area();
//        System.out.println(area);
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Side A");
        sideA=scanner.nextDouble();
        System.out.println("Side B");
        sideB=scanner.nextDouble();
        System.out.println("Side C");
        sideC=scanner.nextDouble();
        triangle=new Triangle(sideA,sideB,sideC);
        area=triangle.calculateArea();
        System.out.println(area);
        
        
        
    }
    
    
}
