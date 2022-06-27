/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.view;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("dat recovered from file manager:" +FileManager.ReadFile("Students Json"));
        int addend1=5;
        int addend2=7;
        int sum;
        
        sum=FileManager.add(addend1, addend2);
        System.out.println("the addition is:"+sum);
    }
    
}
