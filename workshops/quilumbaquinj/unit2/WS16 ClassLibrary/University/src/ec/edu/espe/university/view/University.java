/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.university.view;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class University {
    
    public static void main(String[] args) {
        FileManager fileManager= new FileManager();
        System.out.println("dat recovered from FileManager"+ fileManager.readFile("students.json"));
        
        
    }
    
}
