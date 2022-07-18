
package ec.edu.espe.Spa.controller;

import java.util.Scanner;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class UserController {
    
    public void logIn(){
       String userName;
        String password;
        String userNameManager="ella";
        String password2="ella2";

          Scanner scanner = new Scanner(System.in);
             do {
                System.out.println("============WELCOME TO THE PROGRAM==========\n");
                System.out.println("Username: ");
                userName = scanner.next();
                System.out.println("Password: ");
                password = scanner.next();
            if(!(userName.equals(userNameManager) && password.equals(password2))){
                System.out.println("Invalid password or username");
            }
            }while (!(userName.equals(userNameManager) && password.equals(password2)));
    }
}
    

