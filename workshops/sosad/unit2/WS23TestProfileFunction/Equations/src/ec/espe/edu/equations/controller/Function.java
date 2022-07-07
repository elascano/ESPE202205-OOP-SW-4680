
package ec.espe.edu.equations.controller;
import ec.espe.edu.equations.model.Point;


/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Function {
    Point point;
    public int getXOfLine(int coordinateX)
    {
        int coordinateY;
        coordinateY=2*coordinateX+3;
        Point point = new Point(coordinateX, coordinateY);
        return point.getCoordinateY();
    }
    
     public int getXOfSquareFunction(int coordinateX)
    {
        int coordinateY;
        coordinateY=coordinateX+coordinateX;
        Point point = new Point(coordinateX, coordinateY);
        return point.getCoordinateY();
    }
}
