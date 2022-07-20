package ec.edu.espe.Bookify.model;

import java.util.Scanner;

/**
 *
 * @author QUILUMBAQUIN JAIRO,QUIMBIULCO JUAN,RAUL SILVA,CARLOS RIVERA, DCC0-ESPE: CODEX++
 */
public class User {
    private String UserName;
    private int UserId;
    private String UserEmail;
    private int UserPhone;
    private String UserAddress; 
    private int UserAge;
    private int UserPassword;
    
   
    public User() {
        
    }

    public User(String name, int id, String userEmail, int userPhone, String userAddress, int age, int password) {
        this.UserName = name;   
        this.UserId = id;
        this.UserEmail = userEmail;
        this.UserPhone = userPhone;
        this.UserAddress = userAddress;
        this.UserAge = age;
        this.UserPassword = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    public int getUserPhone() {
        return UserPhone;
    }

    public void setUserPhone(int UserPhone) {
        this.UserPhone = UserPhone;
    }

    public int getUserAge() {
        return UserAge;
    }

    public void setUserAge(int UserAge) {
        this.UserAge = UserAge;
    }

    public int getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(int UserPassword) {
        this.UserPassword = UserPassword;
    }

    
    public String UserData() {
        return "User:" + "name=" + UserName + ", id=" + UserId + ", userEmail=" + UserEmail + ", userPhone=" + UserPhone + ", userAddress=" + UserAddress + ", age=" + UserAge + ", password=" + UserPassword + '\n';
    }

    public String RecordUserData() {
        String UserDataRecord=UserName +";"+ UserId + ";" + UserEmail + ";" + UserPhone + ";" + UserAddress + ";" + UserAge + ";" + UserPassword + "\r\n";
        return UserDataRecord;
    }
    

    /**
     * @param UserAddress the UserAddress to set
     */
    public void setUserAddress(String UserAddress) {
        this.UserAddress = UserAddress;
    }
    
    public void readData(){
           Scanner teclado = new Scanner(System.in);
           System.out.println("Ingrese su ID");
           UserId = teclado.nextInt();
           System.out.println("Ingrse su contraseña:");
           UserPassword = teclado.nextInt();
           System.out.println("Ingresado Exitosamente");
       }
        
}
