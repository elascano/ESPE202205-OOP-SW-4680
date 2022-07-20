
package ec.edu.espe.equations.controller;

import ec.edu.espe.equations.model.Point;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class Function {
    
    Point point;
    
    public int getYOfLine(int coordinateX){
        int coordinateY;
        coordinateY = 2*coordinateX+3;
        
        Point point =new Point(coordinateX, coordinateY);
        
        //do something with this object
        
        return point.getCoordinateY();
    }
    
    public int getYOfSqeareFunction(int coordinateX){
        int coordinateY;
        coordinateY = 2*coordinateX+3;
        
        Point point =new Point(coordinateX, coordinateY);
        
        //do something with this object
        
        return point.getCoordinateY();
    }
}
