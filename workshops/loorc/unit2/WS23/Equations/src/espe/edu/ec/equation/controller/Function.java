
package espe.edu.ec.equation.controller;

import espe.edu.ec.model.Point;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Function {
    
    Point point;
    
    public int getYOfLine(int coordinateX){
        int coordinateY;
        coordinateY = 2 * coordinateX + 3;
        Point point = new Point(coordinateX, coordinateY);
        
        return point.getCoordinateY();
    }
    
    public int getYOfSqareFunction(int coordinateX){
        int coordinateY;
        coordinateY=coordinateX*coordinateX;
        Point point = new Point(coordinateX,coordinateY );
        
        return point.getCoordinateY();
    
    }
}
