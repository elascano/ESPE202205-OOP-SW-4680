 package ec.edu.espe.codeproject.view;
 
import ec.edu.espe.codeproject.model.Cashier;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author  DCCO - ESPE,MyWayCode
 */
public class ViveresPedro {
    public static void main(String[] args) throws IOException {
        System.out.println("Viveres Pedro System, MyWayCode");
        String pathFileSave;
        String pathFileCashierCSV;
        String pathServiceCSV;
        
        pathFileSave = System.getProperty("user.dir");
        pathFileCashierCSV = pathFileSave + "\\cashier.csv";
        
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        
        String cashierAppointment;
        
        ArrayList<Cashier> cashiers;
        
        cashiers = new ArrayList<>();
        Scanner textInput = new Scanner(System.in);
        cashierAppointment = "";
        String pathCashierCSV;
        
        
         File file = new File(pathFileCashierCSV);
                        if (!(file.exists())) {
                            file.createNewFile();
                            fileWriter = new FileWriter(pathFileCashierCSV);
                            fileWriter.append("#ID;CellPhone;Adress;Email;User;Password \n");
                        } else {
                            fileWriter = new FileWriter(pathFileCashierCSV, true);
                        }
                        bufferedWriter = new BufferedWriter(fileWriter);
                        System.out.println("You have selected option 1");
                        String name = null;
                        System.out.println("Write your identification card: ");
                        identificationCard = textInput.next();
                        System.out.println("Write the customer name: ");
                        textInput.nextLine();
                        name = textInput.nextLine();
                        System.out.println("Write the number of the customer: ");
                        number = textInput.nextInt();
                        System.out.println("Enter the date of the next appointment with the next structure");
                        System.out.println("Day/Month/Hour-Minutes");
                        System.out.println("Example: 19/April/10:30");
                        appointment = textInput.next();
                        System.out.println("Enter the address of the customer");
                        address = textInput.next();
                        
                        /////
                        customers.add(new Customer(identificationCard, name, number, false, appointment, address));
                        String str = customers.get(customers.size() - 1).toStringData().replaceAll(",", ";");
 
                        //System.out.println(str);
                        bufferedWriter.append(str + "\n");    
   
                        bufferedWriter.close();

        
       
            System.out.println("Enter your ID: ");
            textData = Input.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enther your Name");
            textData = Input.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enther your Email");
            textData = Input.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enther your User");
            textData = Input.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        
    }

        
    
        

