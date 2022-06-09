 
package ec.edu.espe.CoopLatina.view;

import ec.edu.espe.CoopLatina.model.Bus;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Loor Cesar, Molina Gustavo,DDCO-ESPE,GADC.MSI
 */
public class AdmistrativeDisplay {
    public static void main(String[] args) {
        System.out.println("Welcome to CoopLatina, What i can help you?");
        
        
        ArrayList<Bus> buses;
        int op;
        Scanner text;
        String name;
        buses = new ArrayList<>();
        text= new Scanner(System.in);
        
        System.out.println("transport available\n\n");
        buses.add(0, new Bus("A001", "Marco", 135, 4.8F));
        
        for (Bus buse : buses) {
            System.out.println(buses);
        }
        
//        do {
//            op = text.nextInt();
//            System.out.println("MENU");
//            switch (op) {
//                case 1:
//                    System.out.println("Option 1");
//                    name = text.next();
//                    System.out.println("Welcome");
//                    break;
//                case 2:
//                    System.out.println("Option 2");
//                    name = text.next();
//                    System.out.println("Choose route");
//                default:
//                System.out.println("Ingrese numeros");
//                break;
//            }
//            
//        } while (op!=0);
   Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Choose routes");
            System.out.println("2. Pay for routes");
            System.out.println("3. Pay to routes");
            System.out.println("4. Exit");
 
            try {
 
                System.out.println("choose one of de option");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("you have chosen the option 1");
                        break;
                    case 2:
                        System.out.println("you have chosen the option 2");
                        break;
                    case 3:
                        System.out.println("you have chosen the option 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("just numbers between 1 and 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must choose a valid option (number)");
                sn.next();
            }
        }
 
    }
    }
   


