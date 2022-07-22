/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.areas.view;

import ec.edu.espe.areas.model.Triangle;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class Areas {

    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangle triangle;
        double area ;
           
        triangle = new Triangle();
        area = triangle.calculateArea(4,4,3);
    
        System.out.println(area+ " metros"); 
           area = triangle.calculateArea(5,5,5);
    
        System.out.println(area+ " metros");
     
        
     
    }
    
}
