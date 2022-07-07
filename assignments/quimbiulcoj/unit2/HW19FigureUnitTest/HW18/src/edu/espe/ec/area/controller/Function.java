package edu.espe.ec.area.controller;

import edu.espe.ec.area.model.Parallelogram;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, Codex++
 */
public class Function {
     
    public double calculateParallelogram(double base,double height) { 
        double area;
        area = base*height;
        Parallelogram parallelogram = new Parallelogram (base, height);
        return area;
        
    }
 
    
    }

    

