
package espe.edu.ec.equations.controller;

import espe.edu.ec.equations.model.Point;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Function {
    
    public int getYOfLine(int coordinateX){
        int coordinateY;
        coordinateY = 2*coordinateX+3;
        
        Point point = new Point(coordinateX, coordinateY);
        
        
        
        return point.getCoordinateY();
        
    }
    
    public int getYOfSquareFunction(int coordinateX){
        int coordinateY;
        coordinateY = coordinateX*coordinateX;
        
        Point point = new Point(coordinateX, coordinateY);
        
        return point.getCoordinateY();
        
    }

    
}
