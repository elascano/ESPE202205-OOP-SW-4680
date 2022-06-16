
package hw07writefiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class HW07WriteFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        PrintWriter salida = null;
  
        try {
            salida = new PrintWriter("C:\\Users\\raul2\\OneDrive\\Escritorio\\Programacion orientada a objetos\\02Code\\ESPE202205-OOP-SW-4680\\assignments\\silvar\\unit2\\HW07WriteFiles\\File.txt");   //se crea el fichero
            String cadena;
            System.out.println("Introduce text:");
            cadena = sc.nextLine();                                 
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);                         
                cadena = sc.nextLine();                         
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());                                                                   
        } finally {         
            salida.close();
        }
    }
        
       
 }