
package ec.edu.espe.equations.controller;

import ec.edu.espe.equations.models.Point;

/**
 *
 * @author H301M7
 */
public class Function {
        public int getYOfLine(int coordinateX){
        int coordinateY;
        coordinateY=2*coordinateX+3;
        Point point = new Point(coordinateX,coordinateY );
        
        return point.getCoordinateY();
    }
    
    public int getYOfSqareFunction(int coordinateX){
        int coordinateY;
        coordinateY=coordinateX*coordinateX;
        Point point = new Point(coordinateX,coordinateY );
        
        return point.getCoordinateY();
    }
}