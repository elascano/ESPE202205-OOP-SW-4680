package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.model.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BasicOperation basicOperation;
        basicOperation = new BasicOperation();
        int addend1;
        int addend2;
        int minuend;
        int sustrahend;
        int multiplicand;
        int multiplicator;
        float dividend;
        float divisor;
        int option;
        int sum;
        int diff;
        int product;
        float quotient;
        option = 0;
        
        printMenu();
        
        System.out.println("Select the opperation ->");
        option = keyboard.nextInt();
        
        if(option == 1){
            System.out.println("enter addend 1 ->");
            addend1 = keyboard.nextInt();
            System.out.println("enter addend 2 ->");
            addend2 = keyboard.nextInt();
            sum = basicOperation.add(addend1, addend2); 
            System.out.println("the addition of " + addend1 +"+" + addend2 + "=" + sum); 
        }else if(option == 2){
            System.out.println("enter minuend ->");
            minuend = keyboard.nextInt();
            System.out.println("enter sustrahend ->");
            sustrahend = keyboard.nextInt();
            diff = basicOperation.substract(minuend, sustrahend);
            System.out.println("the difference of " + minuend + "-" + sustrahend + "=" + diff);
        }else if (option == 3){
            System.out.println("enter multiplicand ->");
            multiplicand = keyboard.nextInt();
            System.out.println("enter multiplicator ->");
            multiplicator = keyboard.nextInt();
            product = basicOperation.multiply(multiplicand, multiplicator);
            System.out.println("the difference of " + multiplicand + "*" + multiplicator + "=" + product);
        }else if (option == 4){
            System.out.println("enter dividend ->");
            dividend = keyboard.nextInt();
            System.out.println("enter divisor ->");
            divisor = keyboard.nextInt();
            quotient = basicOperation.divide(dividend, divisor);
            System.out.println("the difference of " + dividend + "/" + divisor + "=" + quotient);
        }        
    }

    private static void printMenu() {
        System.out.println("========================================");
        System.out.println("============BASIC CALCULATOR============");
        System.out.println("========================================");
        
        System.out.println("1- Addition");
        System.out.println("2- Substraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
    }
 
}
