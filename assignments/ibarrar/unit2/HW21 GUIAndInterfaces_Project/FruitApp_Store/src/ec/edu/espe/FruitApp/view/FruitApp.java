package ec.edu.espe.FruitApp.view;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.FruitApp.model.Client;
import ec.edu.espe.fruitApp.model.Fruit;
import ec.edu.espe.fruitApp.model.MongoConnection;
import ec.edu.espe.fruitApp.model.Register;
import ec.edu.espe.fruitApp.model.Vegetable;
import ec.edu.espe.fruitApp.model.Worker;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
//import org.bson.Document;
/**
 *
 *@author Carlos Granda,Ronny Ibarra,Jose Imbaquinga, DCCO-ESPE, Syntax Error
 */



public class FruitApp {
     

     public static void main(String[] args){
         
         MongoConnection mongoConnection;
        mongoConnection = new MongoConnection();
        
        
      //  mongoDB.conectionMongo();
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
        Document document;
        Scanner input;
        String addCustomer;
        
        userDB= mongoConnection.conectionMongo();
        userdatabase=userDB.getDatabase("Clothes");
        userCollection= userdatabase.getCollection("Color");
        
        document=new Document();
        
         System.out.println(mongoConnection);
      
        int opcion2,age,amount,amountVegetable,amountRegister,
                idRegister;
        String cellphone, id;
        double weight,weightVegetable;
        Float cost,costVegetable;
        String name,email,color,colorVegetable,nameVegetable,
                nameRegister,codeRegister,nameFruit;
        
        try {
            String ruta = "C:\\Users\\Dell\\OneDrive\\Documentos\\FruitApp\\FruitApp.csv";
            String contenido = "WELCOME TO THE 'DON MORALES' FRUIT STORE SYSTEM";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        Client c1=new Client();
        System.out.println("WELCOME TO THE 'DON MORALES' FRUIT STORE SYSTEM ");
        System.out.println("Enter an option");
        Scanner entrada=new Scanner(System.in);
      
      
        
         System.out.println("Option 1: Register a new client:");
         System.out.println("Option 2: Register a worker:");
         System.out.println("Option 3: Register the sale of a fruit:");
         System.out.println("Option 4: Record the sale of a vegetable:");
         System.out.println("Option 5: Register payments:");
         System.out.println("Option 6: Exit the menu");
         System.out.println("Choose option: ");
         opcion2=entrada.nextInt();
         System.out.println("Write only in numbers from 1 to 6");
         
         switch(opcion2){
             case 1:
                System.out.println("Enter the id of the "
                        + "person you want to register:");
                id=entrada.nextLine();
                
                System.out.println("Enter the age of the person you "
                        + "want to register:");
                age=entrada.nextInt();
                
                System.out.println("Enter the name you want to register:");
                name=entrada.next();
                
                Client c2=new Client(name,id,age);
        
                System.out.println("The data to be entered is:"+c2);
                break;

                
                
            case 2:
                
                System.out.println("Enter the id of "
                        + "the person you want to register:");
                id=entrada.nextLine();
                
                System.out.println("Enter the age of the "
                        + "person you want to register:");
                age=entrada.nextInt();
                
                System.out.println("Enter the name you want to register:");
                name=entrada.next();
                
                System.out.println("Enter the email:");
                email=entrada.next();
                
                System.out.println("Enter the cellphone "
                        + "of the person you want to register:");
                cellphone=entrada.nextLine();
                
                Worker W1=new Worker(name,id,age,cellphone,email);
                System.out.println("The data to be entered is:"+W1);
               
                 break; 
                 
            case 3:
                
                System.out.println("Enter fruit name");
                nameFruit=entrada.next();
                
                System.out.println("Enter the color of the fruit");
                color=entrada.next();
                
                System.out.println("Enter the amount to sell");
                amount=entrada.nextInt();
                
                System.out.println("Enter the weight of the fruit");
                weight=entrada.nextDouble();
                
                System.out.println("Enter the cost of the fruit:");
                cost=entrada.nextFloat();
                
                Fruit F1=new Fruit(nameFruit,color,amount,weight,cost);
                System.out.println("The data to be entered is:"+F1);
              
                break;
            case 4:
                
                System.out.println("Enter name of vegetable:");
                nameVegetable=entrada.next();
                
                System.out.println("Enter the color of the vegetable:");
                colorVegetable=entrada.next();
                
                System.out.println("Enter the amount to sell:");
                amountVegetable=entrada.nextInt();
                
                System.out.println("Enter the weight of the vegetable:");
                weightVegetable=entrada.nextDouble();
                
                System.out.println("Enter the cost of the vegetable:");
                costVegetable=entrada.nextFloat();
                
                Vegetable V1=new Vegetable(nameVegetable,
                        colorVegetable,amountVegetable,
                        weightVegetable,costVegetable);
                System.out.println("The data of the vegetables that are"
                        + " going to enter:"+V1);
           
                break;
            case 5: 
                
                System.out.println("Enter the name of the worker to be paid:");
                nameRegister=entrada.next();
                
                System.out.println("Enter worker code:");
                codeRegister=entrada.next();
                
                System.out.println("Enter the amount to pay:");
                amountRegister=entrada.nextInt();
                
                System.out.println("Enter the id:");
                idRegister=entrada.nextInt();
                
                Register R1=new Register(nameRegister,codeRegister,
                         amountRegister,idRegister);
                System.out.println("The people who will pay are:"+R1);
             
                break;
            case 6:
                break;
            default : 
                   System.out.println("The option does not exist");
                   break;

                   
         }
        
    }
}

