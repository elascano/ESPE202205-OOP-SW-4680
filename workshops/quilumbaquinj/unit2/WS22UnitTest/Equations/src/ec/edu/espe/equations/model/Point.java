/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.equations.model;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Point {
 
    private int coordinateX;
    private int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Point() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the coordinateX
     */
    public int getCoordinateX() {
        return coordinateX;
    }

    /**
     * @param coordinateX the coordinateX to set
     */
    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    /**
     * @return the coordinateY
     */
    public int getCoordinateY() {
        return coordinateY;
    }

    /**
     * @param coordinateY the coordinateY to set
     */
    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
    
    
    
}
