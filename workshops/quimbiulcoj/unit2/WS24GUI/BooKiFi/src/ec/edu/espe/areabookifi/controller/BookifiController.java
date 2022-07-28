/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.areabookifi.controller;

import ec.edu.espe.areabookifi.model.AddBook;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class BookifiController {
    public boolean addBook(JFrame jFrame, AddBook addBook){
        if (addBook.getTitle().equals("")){
            return false;
        }
        else {
            JOptionPane.showMessageDialog(jFrame, addBook.getTitle());
            return true;
        }
    }
    
}
