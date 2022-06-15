/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.stylesirelia.view;

import ec.edu.espe.stylesirelia.model.Customer;
import ec.edu.espe.stylesirelia.model.Product;
import ec.edu.espe.stylesirelia.model.Service;
import ec.edu.espe.stylesirelia.model.Stylist;
import ec.edu.espe.stylesirelia.model.Supplier;
import ec.edu.espe.stylesirelia.model.Turn;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders user name: espe_smc clave
 * mongodb atlas R6cjoel2019
 *
 */
public class AdministrativeDisplay {

    public static void main(String[] args) {
        System.out.println("System of Styles Irelia");
        String pathDirectory;
        String pathCustomerCSV;
        String pathProductCSV;
        String pathServiceCSV;

        pathDirectory = System.getProperty("user.dir");
        pathCustomerCSV = pathDirectory + "\\customer.csv";
        pathProductCSV = pathDirectory + "\\Product.csv";
        pathServiceCSV = pathDirectory + "\\Service.csv";
        
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;

        ArrayList<Customer> customers;
        ArrayList<Turn> turns;
        ArrayList<Stylist> stylists;
        ArrayList<Product> products;
        ArrayList<Service> services;
        ArrayList<Supplier> suppliers;

        int option;
        int number;
        String identificationCard;
        String appointment;
        String address;
        String product;
        String textService;
        String customerAppointment;
        String stylistAppointment;
        String serviceAppointment;
        String dateTurn;
        float cost;
        String expiration;
        int stock;
        String nameStylist;
        int numberStylist;
        int paymentStylist;
        String addressStylist;
        int price = 0;
        float payment;
        String nameService;

        Scanner textInput;
        boolean exit;

        // pathCustomerCSV = "C:\\Users\\luis1\\Documents\\customers.csv";
        // pathProductCSV = "C:\\Users\\alexa\\OneDrive\\Escritorio\\Product_Styles\\Information_Product.csv";
        // pathServiceCSV = "C:\\Users\\alexa\\OneDrive\\Escritorio\\Product_Styles\\Information_Service.csv";
        exit = false;
        
        customers = new ArrayList<>();
        turns = new ArrayList<>();
        products = new ArrayList<>();
        stylists = new ArrayList<>();
        services = new ArrayList<>();
        suppliers = new ArrayList<>();
        textInput = new Scanner(System.in);
        customerAppointment = "";
        stylistAppointment = "";
        serviceAppointment = "";

        while (!exit) {
            printOptions();

            try {

                System.out.println("Write the one option: ");
                option = textInput.nextInt();
                switch (option) {
                    case 1:
                        //Create file
                        File file = new File(pathCustomerCSV);
                        if (!(file.exists())) {
                            file.createNewFile();
                            fileWriter = new FileWriter(pathCustomerCSV);
                            fileWriter.append("#ID;Name;Customer;Number;Date;address\n");
                        } else {
                            fileWriter = new FileWriter(pathCustomerCSV, true);
                        }
                        bufferedWriter = new BufferedWriter(fileWriter);

                        //--
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
                        /////
                        break;

                    case 2:
                        
                        File fileProduct = new File(pathProductCSV);
                        if (!(fileProduct.exists())) {
                            fileProduct.createNewFile();
                            fileWriter = new FileWriter(pathProductCSV);
                            fileWriter.append("Name;Price;Expiration;Stock\n");
                        } else {
                            fileWriter = new FileWriter(pathProductCSV, true);
                        }
                        bufferedWriter = new BufferedWriter(fileWriter);
                        
                        System.out.println("You have selected option 2");
                        System.out.println("what is the name of the product?");
                        product = textInput.next();
                        System.out.println("what is the cost of the product?");
                        cost = textInput.nextInt();
                        System.out.println("what is the date of the expiration?");
                        expiration = textInput.next();
                        System.out.println("what is the stock of the product?");
                        stock = textInput.nextInt();
                        products.add(new Product(product, cost, expiration, stock));
                        
                       
                        str = products.get(products.size()-1).toStringData().replaceAll(",", ";");
                        bufferedWriter.append(str + "\n");    
   
                        bufferedWriter.close();
                        break;
                    case 3:
                        
                        File fileService = new File(pathServiceCSV);
                        if (!(fileService.exists())) {
                            fileService.createNewFile();
                            fileWriter = new FileWriter(pathServiceCSV);
                            fileWriter.append("Name Service;Price;Pending Payment\n");
                        } else {
                            fileWriter = new FileWriter(pathServiceCSV, true);
                        }
                        bufferedWriter = new BufferedWriter(fileWriter);
                        
                        
                        
                        
                        System.out.println("You have selected option 3");
                        System.out.println("what is the Service: ?");
                        nameService = textInput.next();
                        System.out.println("what is the price of the service?");
                        price = textInput.nextInt();
                        System.out.println("Do you have pending Payment?");
                        payment = textInput.nextInt();
                        services.add(new Service(nameService, price, false, false, stylists));
                        
                        str = services.get(services.size()-1).toStringData().replaceAll(",", ";");
                        bufferedWriter.append(str + "\n");    
   
                        bufferedWriter.close();
                        
                        break;
                    case 4:
                        System.out.println("You have selected option 4");
                        System.out.println("Write the Stylist identification card: ");
                        identificationCard = textInput.next();
                        System.out.println("Write the Stylist name: ");
                        nameStylist = textInput.next();
                        System.out.println("Write the number of the Stylist: ");
                        numberStylist = textInput.nextInt();
                        System.out.println("Write the pending payment with the Stylist: ");
                        paymentStylist = textInput.nextInt();
                        System.out.println("What is the address of the stylist? ");
                        addressStylist = textInput.nextLine();
                        stylists.add(new Stylist(identificationCard, nameStylist, numberStylist, paymentStylist, "Quito", addressStylist));
                        break;
                    case 5:
                        System.out.println("You have selected option 5");
                        String supplier;
                        int numberSupplier;

                        System.out.println("Write the supplier name: ");
                        supplier = textInput.next();
                        System.out.println("Write the number of the Supplier: ");
                        numberSupplier = textInput.nextInt();
                        System.out.println("Write the pending payment with the supplier");
                        payment = textInput.nextInt();
                        suppliers.add(new Supplier(supplier, numberSupplier, false, "Quito", "Ecuador"));
                        break;
                    case 6:

                        System.out.println("You have selected option 6");
                        System.out.println("What customer appointment service?");

                        System.out.println(customers);

                        System.out.println("Write identification card of costumer: ");
                        identificationCard = textInput.next();
                        for (int i = 0; i < customers.size(); i++) {
                            if (identificationCard.equals(customers.get(i).getIdentificationCard())) {
                                customerAppointment = customers.get(i).getName();
                                System.out.println("Selected the customer: " + customers.get(i).getName());
                                break;
                            }
                            System.out.println("Please create a new customer");

                        }

                        System.out.println("Write identification card of stylist: ");
                        identificationCard = textInput.next();
                        for (int i = 0; i < stylists.size(); i++) {
                            if (identificationCard.equals(stylists.get(i).getIdentificationCard())) {
                                stylistAppointment = stylists.get(i).getName();
                                System.out.println("Selected the stylist: " + stylists.get(i).getName());
                                break;
                            }
                            System.out.println("not found stylist");

                        }
                        System.out.println("Write the name service: ");
                        textService = textInput.next();
                        for (int i = 0; i < services.size(); i++) {
                            if (textService.equals(services.get(i).getName())) {
                                serviceAppointment = services.get(i).getName();
                                System.out.println("Selected the service: " + services.get(i).getName());
                                break;
                            }
                            System.out.println("not found service");

                        }
                        System.out.println("Write date turn: ");
                        dateTurn = textInput.next();
                        turns.add(new Turn(1, dateTurn, customerAppointment, serviceAppointment, stylistAppointment));
                        System.out.println("Turns: " + turns);
                        break;
                    case 7:
                        exit = true;
                        break;
                    default:
                        System.out.println("Only numbers 1 ... 7");

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Only enter the numbers");
                textInput.next();
            }

        }

    }

    private static void printOptions() {
        System.out.println("Welcome to system Styles by Irelia");
        System.out.println("This is a options");
        System.out.println("1. Add a new customer");
        System.out.println("2. Add a new product");
        System.out.println("3. Add a new Service");
        System.out.println("4. add a new Stylist");
        System.out.println("5. Add a new Suppplier");
        System.out.println("6. Add a new Turn");
        System.out.println("7. exit");
    }

}
