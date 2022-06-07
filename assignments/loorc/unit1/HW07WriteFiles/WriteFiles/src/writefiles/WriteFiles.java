
package writefiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class WriteFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        PrintWriter salida = null;
  
        try {
            salida = new PrintWriter("C:\\Users\\pc\\Desktop\\2do Semestre\\Poo\\codigo\\ESPE202205-OOP-SW-4680\\assignments\\loorc\\unit1\\HW07WriteFiles\\File.txt");   //se crea el fichero
            String cadena;
            System.out.println("Introduce text:");
            cadena = sc.nextLine();                             //se introduce por teclado una cadena de texto    
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);                         //se escribe la cadena en el fichero
                cadena = sc.nextLine();                         //se introduce por teclado una cadena de texto    
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());                                                                   
        } finally {         
            salida.close();
        }
    }
        
       
 }
    

