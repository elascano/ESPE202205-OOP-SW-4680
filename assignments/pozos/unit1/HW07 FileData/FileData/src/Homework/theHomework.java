/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Steven Pozo, DCCO- ESPE, BettaCoders
 */
public class theHomework {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
        Scanner textInput;
        String textData;
        textInput = new Scanner(System.in);
        try {
            FileWriter fileWriter;
            BufferedWriter bufferedWriter;
            String path = "C:\\Users\\steve\\Desktop\\files data Homework\\el debereishon.txt";
            
            File file = new File(path);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            System.out.println("======User data=======");
            System.out.println("Type your name");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Type your phone number");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Type your address");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Type your age");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Type your date");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
