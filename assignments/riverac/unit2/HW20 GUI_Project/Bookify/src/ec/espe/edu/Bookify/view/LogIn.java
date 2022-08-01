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

public class LogIn {
     

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
           Staff staff;
           User user;
           Catalogue catalogue;
           
           staff = new Staff();
           user = new User();
           catalogue = new Catalogue();
  
            int option;
            option=0;
           
 
        do{
        printMenu();
        
        System.out.println("Select the operation 1-10 or 0 to exit: ");
        option = keyboard.nextInt();
        
        switch(option) {
            case 1:
                user.readData();break;
            case 2:
            staff.RecordUser();break;
        
            case 3:
            //catalogue.showCatalogue();break;
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
  
          
    

