/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.rectanglearea.view;

import ec.edu.espe.rectanglearea.model.Rectangle;
import java.util.Scanner;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class Display {
       
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double base;
        double altura;
        double area;
        Rectangle rectangle;
        
        System.out.println("Inserte la base");
        base=sc.nextDouble();
        System.out.println("Inserte la altura");
        altura=sc.nextDouble();
        
        rectangle=new Rectangle(base,altura);
        area=rectangle.area();
        if(base == altura){
            System.out.println("\nNo es un rectanangulo");
            System.out.println("El area del cuadrado es -> " + area);
        }else{
            System.out.println("\nEl area del rectangulo es -> " + area);
        }
        
    }
    
}
