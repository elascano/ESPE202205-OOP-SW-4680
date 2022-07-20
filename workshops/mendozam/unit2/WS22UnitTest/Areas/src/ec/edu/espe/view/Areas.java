
package ec.edu.espe.view;

import ec.edu.espe.models.Triangle;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class Areas {

    public static void main(String[] args) {
        
                
        Triangle triangle;
        double area;
        
        triangle = new Triangle(4, 4, 3);
        area = triangle.calculatedArea();
        
        System.out.println("Area of a triangle:");
        System.out.println(area);
        
    }

}
