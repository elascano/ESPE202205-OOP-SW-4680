package manageoffiles;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ManageOfFiles {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String cadena;
  
        try (FileWriter fw = new FileWriter("C:/Users/Andres/Desktop/Pruebas/archivos/archivo.txt", true); 
             PrintWriter salida = new PrintWriter(fw)) {
             System.out.println("Introducir informacion del Cliente:. 0 para salir:");                         
             cadena = sc.nextLine();
             while (!cadena.equalsIgnoreCase("0")) {
                     salida.println(cadena);
                     cadena = sc.nextLine();
             }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());                                                                  
        }
    }
}

   
