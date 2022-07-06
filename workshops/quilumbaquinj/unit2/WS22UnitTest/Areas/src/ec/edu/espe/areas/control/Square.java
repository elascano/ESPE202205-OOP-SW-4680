/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.areas.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Square implements Forms{
    
    private float sidea;
    private float squareArea;
    

    public Square() {
    }
    
    public void EnterTrianguleSides() throws IOException{
    
        BufferedReader input;
        input= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese un lado del cuadrado: ");
        setSidea(Float.parseFloat(input.readLine()));
        
    }
    
    

    @Override
    public float CalculateArea() {
        try {
            EnterTrianguleSides();
        } catch (IOException ex) {
            Logger.getLogger(Square.class.getName()).log(Level.SEVERE, null, ex);
        }
        setSquareArea(getSidea()*getSidea());
        return getSquareArea();
    }

    /**
     * @return the sidea
     */
    public float getSidea() {
        return sidea;
    }

    /**
     * @param sidea the sidea to set
     */
    public void setSidea(float sidea) {
        this.sidea = sidea;
    }

    /**
     * @return the squareArea
     */
    public float getSquareArea() {
        return squareArea;
    }

    /**
     * @param squareArea the squareArea to set
     */
    public void setSquareArea(float squareArea) {
        this.squareArea = squareArea;
    }
    
    
    
    
    
    
}
