
package ec.edu.espe.LeatherFlowerSystemProject.model;
import java.util.Scanner;
/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Manager {
    private String userName;
   private String password;

//    public Manager(String userName, String password) {
//        this.userName = userName;
//        this.password = password;
//    }
    public Manager(){
        
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    //FUNTIONS
    public void logIn(){
       String userName;
        String password;
        String userNameManager="ella";
        String password2="ella2";
//        Manager manager=new Manager();
          Scanner scanner = new Scanner(System.in);
//        manager.setPassword("hh");
//        manager.setUserName("123");
        do {
            System.out.println("============WELCOME TO THE PROGRAM==========\n");
            System.out.println("Username: ");
            userName = scanner.next();
            System.out.println("Password: ");
            password = scanner.next();
            if(!(userName.equals(userNameManager) && password.equals(password2))){
                System.out.println("Invalid password or username");
            }
        } while (!(userName.equals(userNameManager) && password.equals(password2)));
    }
}
