package edu.espe.ec.area.view;

import edu.espe.ec.area.model.Rhomboid;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class Area {

    public static void main(String[] args) {
        
        
        double areaCalculate;
        
        
        Rhomboid rhomboid;
        rhomboid = new Rhomboid(4,5.4);
        areaCalculate= rhomboid.calculateRhomboid();
        System.out.println("Area Result:"+areaCalculate);
        
        rhomboid = new Rhomboid(2,0);
        areaCalculate= rhomboid.calculateRhomboid();
        System.out.println("Area Result:"+areaCalculate);
        
        rhomboid = new Rhomboid(12.3,9);
        areaCalculate= rhomboid.calculateRhomboid();
        
        System.out.println("Area Result:"+areaCalculate);
        
    }
    
}
