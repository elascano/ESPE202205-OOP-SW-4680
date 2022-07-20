/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Bookify.controller;

import javax.swing.JLabel;
import javax.swing.JTextField;

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
    
    public void NumberValidation(JTextField txtField, java.awt.event.KeyEvent evt,JLabel lblfield){
        
        String text= txtField.getText();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            txtField.setEditable(true);
            lblfield.setText("");
        }else{
            txtField.setEditable(false);
            
            lblfield.setText("Error");
        }
        
    
    }
    
    public void NumberandLengthValidation(JTextField txtField, java.awt.event.KeyEvent evt,JLabel lblfield,int length){
        
        String text= txtField.getText();
        
        if(text.length()<=length){
            NumberValidation(txtField, evt, lblfield);
            txtField.setEditable(true);
        }else{
            txtField.setEditable(false);
        }
        
        
    }
    
    
}
