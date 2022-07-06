/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.areas.control;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Triangule implements Forms{

        private float sidea;
        private float sideb;
        private float sidec;
        private float trianguleArea;
         private float semiPerimeter;

    
        
    public Triangule() {
    }

    public Triangule(float sidea, float sideb, float sidec) {
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidec = sidec;
    }
        
        
    public void EnterTrianguleSides() throws IOException{
    
        BufferedReader input;
        input= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese el lado a: ");
        setSidea(Float.parseFloat(input.readLine()));
        System.out.println("\nIngrese el lado b: ");
        setSideb(Float.parseFloat(input.readLine()));
        System.out.println("\nIngrese el lado c: ");
        setSidec(Float.parseFloat(input.readLine()));
        
    }
    
    
    @Override
    public float CalculateArea() {
        
            try {
                EnterTrianguleSides();
            } catch (IOException ex) {
                Logger.getLogger(Triangule.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        System.out.println("Calculating....\n");
        setSemiPerimeter((getSidea() + getSideb() + getSidec()) / 2);
        setTrianguleArea((float) Math.sqrt(getSemiPerimeter() * (getSemiPerimeter() - getSidea()) * (getSemiPerimeter() - getSideb()) * (getSemiPerimeter() - getSidec())));
               
        return getTrianguleArea();
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
     * @return the sideb
     */
    public float getSideb() {
        return sideb;
    }

    /**
     * @param sideb the sideb to set
     */
    public void setSideb(float sideb) {
        this.sideb = sideb;
    }

    /**
     * @return the sidec
     */
    public float getSidec() {
        return sidec;
    }

    /**
     * @param sidec the sidec to set
     */
    public void setSidec(float sidec) {
        this.sidec = sidec;
    }

    /**
     * @return the trianguleArea
     */
    public float getTrianguleArea() {
        return trianguleArea;
    }

    /**
     * @param trianguleArea the trianguleArea to set
     */
    public void setTrianguleArea(float trianguleArea) {
        this.trianguleArea = trianguleArea;
    }

    /**
     * @return the semiPerimeter
     */
    public float getSemiPerimeter() {
        return semiPerimeter;
    }

    /**
     * @param semiPerimeter the semiPerimeter to set
     */
    public void setSemiPerimeter(float semiPerimeter) {
        this.semiPerimeter = semiPerimeter;
    }
    
}
