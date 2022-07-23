package pruebas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Carlos Granda, DCCO- ESPE, Syntax Error
 */
public class Pruebas {

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
            String path = "C:\\Users\\Dell\\OneDrive\\Documentos\\assismentg xd\\HW07WriteFiless\\test.csv";
            
            File file = new File(path);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            System.out.println("Create a new customer");
            System.out.println("Enter the name");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enther the number");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enther the address");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enther the appointment");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
