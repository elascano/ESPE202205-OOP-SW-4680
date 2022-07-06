/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.trianglearea.view;

import ec.edu.espe.trianglearea.models.Triangle;
import java.util.Scanner;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class Display {

    public static void main(String[] args) {
        double area;
        double sideA;
        double sideB;
        double sideC;
        
        Triangle triangle;
        Scanner imput;
        imput = new Scanner(System.in);
        
        System.out.println("Side A");
        sideA = Double.parseDouble(imput.nextLine());
        System.out.println("Side B");
        sideB = Double.parseDouble(imput.nextLine());
        System.out.println("Side C");
        sideC = Double.parseDouble(imput.nextLine());
        triangle=new Triangle(sideA,sideB,sideC);
        area=triangle.calculateArea();
        System.out.println(area);
    }
    
}
