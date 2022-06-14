package ec.edu.espe.calculator.view;

import java.util.Scanner;
import ec.edu.espe.calculator.model.BasicOperation;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BasicOperation basicOperation;
        basicOperation = new BasicOperation();
        int addend1;
        int addend2;
        int sum;
        
        int option;
        option = 0;
        
        printMenu();
        
        System.out.println("Select the operation --> , 0 to exit ");
        option = keyboard.nextInt();
        
        if(option == 1){
            System.out.println("Enter addend 1 -->");
            addend1 = keyboard.nextInt();
            System.out.println("Enter addend 2 -->");
            addend2 = keyboard.nextInt();
            
            //call add() function
            sum = basicOperation.add(addend1, addend2);
            System.out.println("The addition of " + addend1 + " + " + addend2 + " = " + sum);
        } else if (option == 2){
            System.out.println("Enter minuend -->");
            int minuend = keyboard.nextInt();
            System.out.println("Enter subtrahend -->");
            int subtrahend = keyboard.nextInt();
            
            //call add() function
            int difference = basicOperation.subtract(minuend, subtrahend);
            System.out.println("The subtraction of " + minuend + " - " + subtrahend + " = " + difference);
          
        }
    }

    private static void printMenu() {
        System.out.println("===========================");
        System.out.println("======BASIC CALCULATOR=====");
        System.out.println("===========================");
        
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }
}