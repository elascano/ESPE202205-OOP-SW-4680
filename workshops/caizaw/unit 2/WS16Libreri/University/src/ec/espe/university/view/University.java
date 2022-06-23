/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ec.espe.university.view;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
import ec.espe.edu.utils
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //leerdatos lerdt = new leerdatos;
        
        FileManager fileManager = new FileManager();
        System.out.println("dat recoverd from filemanger"+fileManager.readFile(".json"));
    }
    
}
