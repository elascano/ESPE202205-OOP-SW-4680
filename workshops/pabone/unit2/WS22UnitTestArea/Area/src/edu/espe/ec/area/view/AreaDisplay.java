package edu.espe.ec.area.view;

import static edu.espe.ec.area.model.Area.area;
import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES` Developers
 */

public class AreaDisplay {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("A R E A");
        double total;
        total = area(4, 4, 3);
        
        total = area(5, 5, 5);
        
        total = area(4.3, 3.4, 5.2);
        
        System.out.println("A R E A");
        System.out.println("The area is: "+ total+ "\n");

    }
    
}
