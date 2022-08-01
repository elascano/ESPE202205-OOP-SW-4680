package ec.edu.espe.areaRectangle.view;

import ec.edu.espe.areaRectangle.model.Rectangle;
import java.util.Scanner;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class AreaRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double height;
        double area;
        Rectangle rectangle;

        System.out.println("Insert base");
       base = 23;
        System.out.println("Insert height");
        height = sc.nextDouble();

        rectangle = new Rectangle(base, height);
        area = rectangle.calculateAreaRectangle();
        System.out.println(area);
    }

}
