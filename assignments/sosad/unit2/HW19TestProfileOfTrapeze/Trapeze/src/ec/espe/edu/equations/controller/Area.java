
package ec.espe.edu.equations.controller;
import ec.espe.edu.equations.model.Trapeze;
import java.text.DecimalFormat;


/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Area {
    Trapeze trapeze;
    public double computeArea(double longBase,double shortBase,double altitude)
    {
        double area;
        area=((longBase+shortBase)/2)*altitude;
        Trapeze trapeze = new Trapeze(longBase, shortBase, altitude,area);
        return trapeze.getArea();
    }
 
    
}
