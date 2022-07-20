package ec.edu.espe.areas.view;

import ec.edu.espe.areas.model.Square;
import java.util.Scanner;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class HW18CalculareOfSquare {

    public static void main(String[] args) {
        Square square;
        Scanner entrada=new Scanner(System.in);
        double area;
        int base, height;
        System.out.println("Enter base:");
        base=entrada.nextInt();
        System.out.println("Enter height:");
        height=entrada.nextInt();
        square = new Square(base,height);
        area= square.CalculateArea();
        System.out.println(area);
        
        
    }
}
