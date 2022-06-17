package prueba;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Prueba {
    
    public static void main(String[] args) throws IOException{

        try {
            FileWriter fw = new FileWriter("C:\\Users\\danyc\\OneDrive\\Escritorio\\file.txt");
            
            Scanner lector = new Scanner(System.in);
            
            String name;
            int number;
            String address;
            System.out.println("Data User");
            System.out.println("Insert name");
            name = lector.next();
            System.out.println("Insert address");
            address = lector.next();
            System.out.println("Insert number");
            number = lector.nextInt();
        }
    }
    
}
