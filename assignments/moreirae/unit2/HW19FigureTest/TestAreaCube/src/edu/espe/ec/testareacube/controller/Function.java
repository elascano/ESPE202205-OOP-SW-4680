
package edu.espe.ec.testareacube.controller;

import edu.espe.ec.testareacube.model.Cube;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Function {
    
    public double getAreaOfCube(double aSide){
        double area;
        double aFinalSide;
        
        aFinalSide = aSide * aSide;
        area = aFinalSide * 6;
        
        Cube cube = new Cube(aSide, area);
       
        return cube.getArea();
    }
    
}
