 
package ec.edu.espe.CoopLatina.view;

import ec.edu.espe.CoopLatina.model.Bus;
import ec.edu.espe.CoopLatina.model.Customer;
import ec.edu.espe.CoopLatina.model.Gas;
import ec.edu.espe.CoopLatina.model.Passage;
import ec.edu.espe.CoopLatina.model.Passenger;
import ec.edu.espe.CoopLatina.model.Routes;
import ec.edu.espe.CoopLatina.model.SquareParts;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author Loor Cesar, Molina Gustavo,DDCO-ESPE,GADC.MSI
 */
public class AdmistrativeDisplay {
    
    public static void main(String[] args) throws IOException{
        
        System.out.println("\t=========================");
        System.out.println("\t==WELCOME TO COOPLATINA==");
        System.out.println("\t=========================");
        
        FileWriter fileWriter;
        BufferedWriter BufferedWriter;
        
        int id;
        int op;
        int number;
        String identificationCard;
        String name;
        String address;
        String email;
      
        String pathCustomerCVS;
        
        //Al momento de ejecutar el codigo para guardar datos deben ubicar su carpeta para guardar .csv
        pathCustomerCVS = "C:\\Users\\pc\\Desktop\\2do Semestre\\Poo\\codigo\\G-4-GADC.MSI\\costumer.csv";
        
        
        ArrayList<Routes>routes;
        ArrayList<Bus>buses;
        ArrayList<SquareParts>squarts;
        ArrayList<Customer>customers;
        ArrayList<Gas>gas;
        ArrayList<Passage>passage;
        ArrayList<Passenger>passengers;
        
      
        buses = new ArrayList<>();
        routes = new ArrayList<>();
      //squareparts = new ArrayList<>();
        customers = new ArrayList<>();
        
       Scanner textInput = new Scanner(System.in);
       
        
        
        //Buses disponibles
        buses.add( new Bus("A001", "Marco", 35, 0.35f));
        buses.add(new Bus("A003", "Jorde", 13, 0.4f));
        
        //Rutas disponibles
        routes.add(new Routes("Norte", 35, true, 15, 0.35f));
        routes.add(new Routes("Sur", 13, true, 25, 0.40f));
        
     
        
            Scanner sn = new Scanner(System.in);
            boolean exit = false;
             
 
        
        while (!exit) {
            printOption();
           
            try {
 
                System.out.println("choose one of de option");
                 op = textInput.nextInt();
   
                switch (op) {
                    case 1:
                        File file = new File(pathCustomerCVS);
                        if (!(file.exists())) {
                          file.createNewFile();
                          fileWriter = new FileWriter(pathCustomerCVS);
                          fileWriter.append("ID;Name;Customer;Number;Adress\n");
                          fileWriter.close();
                        }else{
                           fileWriter = new FileWriter(pathCustomerCVS,true);
                        }
                           BufferedWriter = new BufferedWriter(fileWriter);
                           System.out.println(file.exists());
                           
                           System.out.println("You choose the option Nº1\n");
                        System.out.println("\n\n======Type Data about  user======");
                        
                        System.out.println("Write your Identification");
                        identificationCard= sn.next();
                        System.out.println("Write the costumer name");
                        textInput.nextLine();
                        name = textInput.nextLine();
                        System.out.println("Write the number of your phone");
                        number = textInput.nextInt();
                        System.out.println("Write the address");
                        address = textInput.next();
                        
                       customers.add(new Customer(identificationCard, name, number, address));
                       String str = customers.get(customers.size()-1).toString().replaceAll(",",";");
                       
                        System.out.println(str);
                        BufferedWriter.append(str+"\n");
                        BufferedWriter.close();
                        
                     break;  
  
    
                    case 2:
                        System.out.println("\n\n======The available routes are======");

                        System.out.println(routes);
                        break;
                        
                    case 3:
                        System.out.println("\n\n======The avalible bus are======");
                        System.out.println(buses);
                        break;
                    case 4: 
                        
                        
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("just numbers between 1 and 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must choose a valid option (number)");
                sn.next();
            }
        }

    }
    

    private static void printOption() {
        System.out.println("Type 1 to introduce the user");
        System.out.println("Type 2 to view available routes");
        System.out.println("Type 3 to view the bus available");
        System.out.println("Type 4 Cooming Soom");
        System.out.println("Type 5 to exit");
         
    }
 }
   
            



