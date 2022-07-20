/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Bookify.controller;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class InputNumbersValidation {
    
    public boolean ValidationNumbers(String inputJT){
    
    int input;
     try{
            
        input=Integer.parseInt(inputJT);
        return true;
     
     }catch(NumberFormatException e){
        
         return false;
     }
    
    }
}
