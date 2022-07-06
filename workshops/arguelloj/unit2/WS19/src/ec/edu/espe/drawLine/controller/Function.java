package ec.edu.espe.drawLine.controller;

import ec.edu.espe.drawLine.model.Point;

/**
 *
 * @author H301
 */
public class Function {
    
    Point point;
    
    public int getYOfLine(int coordinateX){
        int coordinateY;
        coordinateY = 2*coordinateX+3;

        Point point = new Point(coordinateX, coordinateY);
        
        // do something with this object
        
        return point.getCoordinateY();
        
    }
    
    public int getYOfSqareFunction(int coordinateX){
        int coordinateY;
        coordinateY = coordinateX+coordinateX;

        Point point = new Point(coordinateX, coordinateY);
        
        // do something with this object
        
        return point.getCoordinateY();   
    }
     
}