/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.university.view;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class University {
<<<<<<< HEAD
    
    public static void main(String[] args) {
        //FileManager fileManager = new FileManager();
        
        System.out.println("Data recovered from File Manager -> "+FileManager.readFile(" students.json"));
        
        int addend1= 5;
        int addend2 = 46;
        int sum;
        sum = FileManager.add(addend1, addend2);
        System.out.println("the adition is ->" +sum);
=======
    public static void main(String[] args) {
        FileManager filemanager = new FileManger();
        
        System.out.println("data recovered from File Manager"+fileManager);
>>>>>>> 6c10277bb0a3b48c5730e68190daeee0dc448b0d
    }
    
}
