/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.equations.controller;

import ec.edu.espe.equations.model.Point;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Function {
 
    public int getOYfLine(int coordinateX){
    
        
        Point point;
        int coordinateY;
        
        coordinateY=2*coordinateX+3;
        point= new Point(coordinateX,coordinateY);
        
        return point.getCoordinateY();
    }
}
