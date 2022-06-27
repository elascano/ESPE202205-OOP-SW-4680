/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import utils.CsvManager;
import utils.FileManager;
import utils.JsonManager;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class TEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileManager fileManager;
        fileManager=new CsvManager();
        
        System.out.println("fileManager object is of type -> "+ fileManager.getClass());
        
        fileManager=new JsonManager();
        
        System.out.println("fileManager object is of type -> "+ fileManager.getClass());
        
        String name;
        name="Jairo";
        
        System.out.println("name object is of type -> "+ name.getClass());
        
        if(fileManager instanceof CsvManager){
            System.out.println("This is a CSV file system");
        }else if(fileManager instanceof JsonManager){
            System.out.println("This is a JSON file system");
        }
    }
    
}
