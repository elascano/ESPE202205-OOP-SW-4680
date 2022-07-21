package ec.espe.edu.Calculator.View;

import ec.espe.edu.Calculator.Model.BasicOperation;
import java.util.Scanner;



/**
 *
 * @author Daniela Tituaña, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        //para ingresar en el teclado
        Scanner keyboard = new Scanner(System.in);
        //cojer los metodos de las clase
        BasicOperation basicOperation;
        basicOperation = new BasicOperation(); //Instanciar
        //Declarar variables
        int addend1;
        int addend2;
        
        int sum;
        
        int minuend;
        int subtrahen;
        int difference;
        
        
        int option;
      
        
                
        prinMenu();
        
        System.out.println("Select the operation--->[1|2|3|4], 0 to exit: ");
        option = keyboard.nextInt();
        
        if (option == 1) {
            System.out.println("Enter addend 1:");
            addend1 = keyboard.nextInt();
            System.out.println("Enter addend 2:");
            addend2 = keyboard.nextInt();
            sum = basicOperation.add(addend1, addend2);
            
            //Call add()funtion
            System.out.println("The adition of "+ addend1 + " + " + addend2 +" = " + sum);
        
        } else if (option == 2) {
            System.out.println("Enter minuend:");
            minuend = keyboard.nextInt();
            System.out.println("Enter subtrahen:");
            subtrahen = keyboard.nextInt();
            difference = basicOperation.subtract(minuend, subtrahen);
            
            //Call add()funtion
            System.out.println("The subtraction of "+ minuend + " - " + subtrahen +" = " + difference);
        }
    }

    private static void prinMenu() {
        System.out.println("=================================");
        System.out.println("========BASIC CALCULATOR=========");
        System.out.println("=================================");
        
        
        System.out.println("1.-Addition");
        System.out.println("2.-Subtraction");
        System.out.println("3.-Multiplication");
        System.out.println("4.-Division");
    }
  
   }
    

