package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.model.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BasicOperation basicOperation;
        basicOperation = new BasicOperation();
        int addend1;
        int addend2;
        int sum;
        int minuend;
        int subtrahend;
        int subtract;
        
        int option;
        option = 0;
        
        printMenu();
        
        System.out.println("Select the operation->");
        option = keyboard.nextInt();
        if(option == 1){
            System.out.println("Enter addend 1->");
            addend1 = keyboard.nextInt();
            System.out.println("Enter addend 2->");
            addend2 = keyboard.nextInt();
            sum = basicOperation.add(addend1,addend2);
            //call add()function
            System.out.println("the addition of " +addend1+ "+" +addend2+"=" +sum);
        }else if (option == 2){
        System.out.println("Enter minuend ->");
            minuend = keyboard.nextInt();
            System.out.println("Enter subtrahend ->");
            subtrahend = keyboard.nextInt();
            subtract = basicOperation.subtract(minuend,subtrahend);
            //call add()function
            System.out.println("the subtraction of " +minuend+ "-" +subtrahend+"=" +subtract);
        }     
    }

    private static void printMenu() {
        System.out.println(" ==================== ");
        System.out.println("   BASIC CALCULATOR   ");
        System.out.println(" ==================== ");
        
        System.out.println("1.-Addition");
        System.out.println("2.-Subtract");
        System.out.println("3.-Multiplication");
        System.out.println("4.-Division");
    }
}
