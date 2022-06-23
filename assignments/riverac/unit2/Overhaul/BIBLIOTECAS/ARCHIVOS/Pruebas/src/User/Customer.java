package User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Customer {
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
            
            System.out.println("Name: ");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("ID: ");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enther the number: ");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("userEmail: ");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("userPhone: ");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("userAdress: ");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Age: ");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Password: ");
            textData = textInput.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}   

