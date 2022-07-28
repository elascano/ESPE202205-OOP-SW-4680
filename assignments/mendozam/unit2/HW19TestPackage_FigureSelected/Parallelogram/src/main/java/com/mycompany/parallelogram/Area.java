
package com.mycompany.parallelogram;

import edu.espe.ec.area.model.Parallelogram;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class Area {

    public static void main(String[] args) 
    {
        
        double areaCalculate;
        
        
        Parallelogram parallelogram;
        parallelogram = new Parallelogram(12,5);
        areaCalculate= parallelogram.calculateParallelogram();
        System.out.println("Area Result:"+areaCalculate);
        
        
        parallelogram = new Parallelogram(2,6.4);
        areaCalculate= parallelogram.calculateParallelogram();
        System.out.println("Area Result:"+areaCalculate);
        
        
        parallelogram = new Parallelogram(9,3);
        areaCalculate= parallelogram.calculateParallelogram();
        System.out.println("Area Result:"+areaCalculate);
    
    }   
}
