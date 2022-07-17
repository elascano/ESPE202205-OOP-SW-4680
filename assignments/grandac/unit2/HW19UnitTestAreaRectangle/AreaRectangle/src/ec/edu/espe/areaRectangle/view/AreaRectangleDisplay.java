
package ec.edu.espe.areaRectangle.view;

import ec.edu.espe.areaRectangle.model.Rectangle;
import java.util.Scanner;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class AreaRectangleDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double base;
        double height;
        double area;
        Rectangle rectangle;
        
        System.out.println("Insert base");
        base=sc.nextDouble();
        System.out.println("Insert height");
        height=sc.nextDouble();
        
        rectangle=new Rectangle(base,height);
//        area=rectangle.calculateAreaRectangle();
//        System.out.println(area);
    }
    
}
