/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.stylist.controller;

import ec.edu.espe.stylist.model.Product;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class ProductController {
    public boolean add(JFrame jframe, Product product){
       if(product.getName().equals("")){
           return false;
       } 
       else{
           JOptionPane.showMessageDialog(jFrame, product.getName());
           return true;
       } 
    }
}
