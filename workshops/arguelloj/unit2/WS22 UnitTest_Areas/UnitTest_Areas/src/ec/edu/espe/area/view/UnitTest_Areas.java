
package ec.edu.espe.area.view;

import ec.edu.espe.area.model.Triangle;
import java.util.Scanner;

/**
 *
 * @author Joel Arguello, DCCO- ESPE, BettaCoders
 */
public class UnitTest_Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double area;
//        int lado_a;
//        int lado_b;
//        int lado_c;
        
//        System.out.println("ingrese los 3 las medidas de los 3 lados del triangulo en metros");
//        System.out.println("lado a");
//        lado_a=sc.nextInt();
//        System.out.println("lado b");
//        lado_b=sc.nextInt();
//        System.out.println("lado c");
//        lado_c=sc.nextInt();
        
//        if((lado_a == lado_b && lado_a == lado_c)&& lado_b==lado_c) {
//            
//            
//        } 

        Triangle triangle = new Triangle();
        area=triangle.calculateAre(4, 4, 3);
        System.out.println(area);
    
}
}