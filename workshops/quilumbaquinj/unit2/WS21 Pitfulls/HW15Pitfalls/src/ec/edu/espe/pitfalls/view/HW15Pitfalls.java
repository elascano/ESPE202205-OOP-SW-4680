/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.pitfalls.view;

import java.util.Scanner;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class HW15Pitfalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input;
        int type;
        
        input= new Scanner(System.in);
        
        System.out.println("Seleccione el tipo de archivo que desea crear");
        System.out.println("1.PDF\n");
        System.out.println("2.DOC\n");
        System.out.println("3.CSV\n");
        System.out.println("4.TXT\n");
        type=input.nextInt();
        
        
        if(type==1){
            System.out.println("PDF was created");
        }else{
            if(type==2){
            System.out.println("DOC was created");
        }else{
                if(type==3){
            System.out.println("CSV was created");
        }else{
        if(type==4){
            System.out.println("TXT was created");
        }else{
        
        }
        }
        
        }
        }
        
        
    }
    
}
