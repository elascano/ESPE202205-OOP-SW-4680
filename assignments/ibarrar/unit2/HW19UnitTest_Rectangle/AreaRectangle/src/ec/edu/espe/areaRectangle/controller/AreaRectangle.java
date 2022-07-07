
package ec.edu.espe.areaRectangle.controller;

import ec.edu.espe.areaRectangle.model.Rectangle;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class AreaRectangle {
    
    Rectangle rectangle;
        public double calculateAreaRectangle(double base,double height){
        double area;
       
        area=base*height;
        rectangle=new Rectangle(base,height);
        return area;
    }
}
