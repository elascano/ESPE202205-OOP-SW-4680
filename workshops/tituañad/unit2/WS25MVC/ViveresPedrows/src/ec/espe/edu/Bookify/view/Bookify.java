/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.Bookify.view;





import ec.edu.espe.Bookify.model.Staff;
import ec.edu.espe.Bookify.model.User;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author QUILUMBAQUIN JAIRO,QUIMBIULCO JUAN,RAUL SILVA,CARLOS RIVERA, DCC0-ESPE: CODEX++
 * 
 */

public class Bookify {
     

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
           Staff staff;
           User user;
           
           
           staff = new Staff();
           user = new User();
           
  
            int option;
            option=0;
           
           
           
           
        
        do{
        printMenu();
        
        System.out.println("Select the operation--->[1|2|3|4|5|6|7|8|9|10], 0 to exit: ");
        option = keyboard.nextInt();
        
        switch(option) {
            case 1:
                user.readData();break;
            case 2:
                staff.RecordUser();break;
            case 3:
                staff.ShowUsers();break;
        }
            
        }while(option!=0);
        
 }

    private static void printMenu() {
        System.out.println("========================================================");
        System.out.println("=========================BOOKIFY========================");
        System.out.println("========================================================");
        
        System.out.println("1.-Log In");
        System.out.println("2.-Add New User");
        System.out.println("3.-Add Product");
        System.out.println("4.-Show Catalogue");
        System.out.println("5.-Manage Product");
        System.out.println("6.-Borrow Product");
        System.out.println("7.-Return Product");
        System.out.println("8.-Product Information");
        System.out.println("9.-Pay Fines");
        System.out.println("10.-Donate");
        System.out.println("0.-Exit");
    }
    
}
  
          
    

