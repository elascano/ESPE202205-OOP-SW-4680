/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fruteri.controller;

import ec.edu.espe.fruteri.model.Customer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class CustomerController {
    
    public boolean register(Customer customer,JFrame frmFrame){
     String message;
    
     JOptionPane.showMessageDialog(frmFrame, customer.getFullName());
    return true; 
    } 
            
            
}
