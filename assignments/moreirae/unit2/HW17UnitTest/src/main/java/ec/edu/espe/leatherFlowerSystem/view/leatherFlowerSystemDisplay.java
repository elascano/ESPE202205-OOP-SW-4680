package ec.edu.espe.leatherFlowerSystem.view;

//import ec.edu.espe.leatherFlowerSystem.model.Manager;
import ec.edu.espe.leatherFlowerSystem.model.Customer;
import ec.edu.espe.leatherFlowerSystem.model.Manager;
import ec.edu.espe.leatherFlowerSystem.model.Service;
import static ec.edu.espe.leatherFlowerSystem.model.Service.chooseService;
import static ec.edu.espe.leatherFlowerSystem.model.Service.giveDiscount;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class leatherFlowerSystemDisplay {

    public static void main(String[] args) {
        
       
        int discount = giveDiscount(0);
        System.out.println(discount + "%");
        boolean boolean1 = chooseService(0);
        System.out.println(boolean1);
        
        
        String userName1;
        String password1;
        short option;
        short optionExit;
        String pathDirectory;
        String pathCustomerCSV;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        ArrayList<Customer> customers;
        ArrayList<Service> services;
        
        
        Customer customer;
        Service service;
        pathDirectory = System.getProperty("user.dir");
        pathCustomerCSV = pathDirectory + "\\customer.csv";

        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        customers = new ArrayList<>(); 
        services = new ArrayList<>();
            logInAdmin();
            option=principalMenu();

        switch (option) {
            case 1:

                String name;
                String surname;
                String ID;
                String email;
                String cellphone;
                String hour;
                //    Client client=new Client();
                System.out.println("\tSCHEDULE APPOINTMENT");
                System.out.println("\tAdd client");

                try {
                    File file = new File(pathCustomerCSV);

                    if (!(file.exists())) {
                        file.createNewFile();
                        fileWriter = new FileWriter(pathCustomerCSV);
                        fileWriter.append("Name;Surnames;Cellphone;ID;E-mail");
                        fileWriter.append("\t;hour\n");
                     //   fileWriter.close();
                    } else {
                        fileWriter = new FileWriter(pathCustomerCSV, true);
                    }
                    bufferedWriter = new BufferedWriter(fileWriter);
                    
                    System.out.println("- Full Names: ");
                   // scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("- Full Surnames:  ");
                    //scanner.nextLine();
                    surname = scanner.nextLine();
                    System.out.println("- Cellphone:  ");
                    //scanner.nextLine();
                    cellphone = scanner.nextLine();
                    System.out.println("- ID: ");
                    //scanner.nextLine();
                    ID = scanner.nextLine();
                    System.out.println("- E-mail: ");
                    //scanner.nextLine();
                    email = scanner.nextLine();
                    System.out.println("Choose Service");
                    System.out.println("hour");
                    hour=scanner.nextLine();
                    System.out.println("Give Discount");
                    System.out.println("Bill Service Type");
                    customer = new Customer(name, surname, cellphone,ID, email);
                    service = new Service(hour,"","", (float) 23.3);
                    customers.add(customer);
                    services.add(service);
                    bufferedWriter.append(customers.get(customers.size() - 1).toString().replaceAll(",", ";")+"\n");
            //        bufferedWriter.append(services.get(services.size() - 1) .toString().replaceAll(",", ";"));
                    bufferedWriter.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }

                break;

            case 2:
                System.out.println("\tDEFER APPOINMENT");
                System.out.println("- Enter de ID number");
                break;
            case 3:
                System.out.println("\tCANCEL APPOINMENT");
                System.out.println("- Enter de ID number");
                break;
            case 4:
                do {
                    System.out.println("Do you want exit of system?");
                    System.out.println("1. Yes");
                    System.out.println("2. Return Menu");
                    System.out.println("Choose one option:");
                    optionExit = scanner.nextShort();
                } while (optionExit > 2);
                if (optionExit == 1) {
                    System.exit(0);
                } else if (optionExit == 2) {
                    System.exit(1);
                }

                break;
        }
    }
    
    
    public static short principalMenu(){
        short option;
        Scanner scanner = new Scanner(System.in);
         do {
            System.out.println("==========WELCOME ESTEFANIA=============\n");
            System.out.println("\t\tMENU");
            System.out.println("1. Schedule Appointment");
            System.out.println("2. Defer Appointment");
            System.out.println("3. Cancel Appointment");
            System.out.println("4. Exit");
            System.out.println("Choose one option:  ");
            option = scanner.nextShort();
            } while (option > 3);
              return option;
    }
    
    public static void logInAdmin(){
        String userName1;
        String password1;
        Manager manager=new Manager();
        Scanner scanner = new Scanner(System.in);
        manager.setPassword("passwordEstefaM22");
        manager.setUserName("EstefaM22");
        do {
            System.out.println("============WELCOME TO THE PROGRAM==========\n");
            System.out.println("type your username");
            userName1 = scanner.next();
            System.out.println("type your password");
            password1 = scanner.next();
        } while (!(userName1.equals(manager.getUserName()) && password1.equals(manager.getPassword())));
    }
//        public static void chooseService(){
//            Service service= new Service();
//            Scanner scanner = new Scanner(System.in);
//            short optionService;
//            service.setType("1. Laser depilation");
//            service.setType("2. Facial treatment");
//            service.setType("3. Acne treatment");
//            service.setType("4. Stain blurring");
//            service.setType("5. Deep hydration");
//            service.setType("6. Chemical peeling");
//            service.setType("7. Platelet rich plasma");
//            service.setType("8. Reduction measures");
//            service.setType("9. Body toning");
//            service.setType("10. Blurring of stretch marks");
//            service.setType("11. Increasing of buttocks");
//            service.setType("12. Ionic detox");
//            service.setType("13. Microblanding");
//            
//            do{
//            System.out.println("1. Laser depilation");
//            System.out.println("2. Facial treatment");
//            System.out.println("3. Acne treatment");
//            System.out.println("4. Stain blurring");
//            System.out.println("5. Deep hydration");
//            System.out.println("6. Chemical peeling");
//            System.out.println("7. Platelet rich plasma");
//            System.out.println("8. Reduction measures");
//            System.out.println("9. Body toning");
//            System.out.println("10. Blurring of stretch marks");
//            System.out.println("11. Increasing of buttocks");
//            System.out.println("12. Ionic detox");
//            System.out.println("13. Microblanding"); 
//            System.out.println("Choose the service you want to schedule");
//            optionService=scanner.nextShort();
//            }while(optionService>13);
//            switch(optionService){
//                case 1:
//                    service.setType("1. Laser depilation");
//                    service.setCost(optionService);
//                    service.setDate(date);
//                    service.setHourOfAttention(hourOfAttention);
//                   
//                case 2:
//                case 3:
//                case 4:
//                case 5:
//                case 6:
//                case 7:
//                case 8:
//                case 9:
//                case 10:
//                case 11:
//                case 12:
//                case 13:
//                    
//            }
//}

 
   
}

