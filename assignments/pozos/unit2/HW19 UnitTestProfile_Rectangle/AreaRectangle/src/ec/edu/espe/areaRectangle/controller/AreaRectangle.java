
package ec.edu.espe.areaRectangle.controller;

import ec.edu.espe.areaRectangle.model.Rectangle;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class AreaRectangle {
    
    Rectangle rectangle;
        public double calculateAreaRectangle(double base,double height){
        double area;
        double salir;
       
        area=base*height;
        rectangle=new Rectangle(base,height);

        return area;
    }
}
