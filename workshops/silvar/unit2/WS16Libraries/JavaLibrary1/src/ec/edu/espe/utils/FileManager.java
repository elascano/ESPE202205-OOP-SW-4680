<<<<<<< HEAD
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
>>>>>>> 6c10277bb0a3b48c5730e68190daeee0dc448b0d
package ec.edu.espe.utils;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
<<<<<<< HEAD
public class FileManager{
    public static String readFile(String fileName){
        //code to read from file
        String data ="From" +fileName+ "{\"name\":\"Raúl\"}";
        return data;
    }
    
    public static int add(int addend1, int addend2){
=======
public class FileManage {
    public String readFiles(String fileName){
        String data = "{\"name\":\"Raúl\"}";
        return data;
    }
    public int add(int addend1, int addend2){
>>>>>>> 6c10277bb0a3b48c5730e68190daeee0dc448b0d
        int sum;
        sum = addend1+addend2;
        return sum;
    }
}
