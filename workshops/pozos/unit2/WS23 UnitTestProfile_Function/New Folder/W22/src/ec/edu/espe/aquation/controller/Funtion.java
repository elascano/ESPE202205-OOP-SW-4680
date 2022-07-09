
package ec.edu.espe.aquation.controller;

import ec.edu.espe.aquation.model.Point;

/**
 *
 * @author Stven Pozo
 */
public class Funtion {
    
    Point point;
    
    public int getYOfLine(int coordenateX){
        int coordenateY;
        coordenateY=2*coordenateX+3;
        Point point = new Point(coordenateX,coordenateY);
        return point.getCoordenateY();
    }
     public int getYOSquareFuntion(int coordenateX){
        int coordenateY;
        coordenateY=coordenateX*coordenateX;
        
        Point point = new Point(coordenateX,coordenateY);
        return point.getCoordenateY();
    }
    }
    
