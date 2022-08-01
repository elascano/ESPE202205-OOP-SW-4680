package edu.espe.ec.area.controller;

import edu.espe.ec.area.model.Parallelogram;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class Function {
     
    public double calculateParallelogram(double base,double height) { 
        double area;
        area = base*height;
        Parallelogram parallelogram = new Parallelogram (base, height);
        return area;
        
    }
 
    
    }

    

