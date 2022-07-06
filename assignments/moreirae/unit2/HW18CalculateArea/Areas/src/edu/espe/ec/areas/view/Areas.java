
package edu.espe.ec.areas.view;

import edu.espe.ec.areas.model.Cube;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cube cube;
        double area;
        
        cube = new Cube(5);
        area = cube.calculateCubeArea();
        
        System.out.println("The area of the cube is -> " + area);
        
        cube = new Cube(6);
        area = cube.calculateCubeArea();
        
        System.out.println("The area of the cube is -> " + area);
      
        cube = new Cube(10.5);
        area = cube.calculateCubeArea();
        System.out.println("The area of the cube -> is " + area);
    }
    
}
