package pruebas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
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
            String path = "E:\\Documentos Personales\\Documentos\\ESPE\\TXT.csv";
            
            File file = new File(path);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            System.out.println("Good Morning");
            System.out.println("Please complete the following information");
            System.out.println("Enter your name: ");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enter your number");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enter your e-mail");
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
