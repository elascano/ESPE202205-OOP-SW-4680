/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.model;

import java.util.Scanner;

/**
 *
 * @author QUILUMBAQUIN JAIRO,QUIMBIULCO JUAN,RAUL SILVA,CARLOS RIVERA, DCC0-ESPE: CODEX++
 */
public class User {
    private String name;
    private int id;
    private String userEmail;
    private int userPhone;
    private String userAddress; 
    private int age;
    private int password;
    
   
    public User() {
        
    }

    public User(String name, int id, String userEmail, int userPhone, String userAddress, int age, int password) {
        this.name = name;
        this.id = id;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.age = age;
        this.password = password;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", id=" + id + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", userAddress=" + userAddress + ", age=" + age + ", password=" + password + '}';
    }



    /**
     * @param userAddress the userAddress to set
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    
    public void readData(){
           Scanner teclado = new Scanner(System.in);
           System.out.println("Ingrese su ID");
           id = teclado.nextInt();
           System.out.println("Ingrse su contraseña:");
           password = teclado.nextInt();
           System.out.println("Ingresado Exitosamente");
       }
        
}
