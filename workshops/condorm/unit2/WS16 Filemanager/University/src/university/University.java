/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package university;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class University {

    
    public static void main(String[] args) {
        FileManager fileManager=new FileManager();
        System.out.println("data recoverd from File Manager -->"+FileManager.readFile("File Manager"));
        
        int addend1=5;
        int addend2=4;
        int sum;
        sum=FileManager.add(addend1,addend2);
        System.out.println("the addition is -->"+sum);
    }
    
}
