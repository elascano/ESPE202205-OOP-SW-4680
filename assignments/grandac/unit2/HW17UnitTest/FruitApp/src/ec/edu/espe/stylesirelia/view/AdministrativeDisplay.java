package ec.edu.espe.stylesirelia.view;

import com.google.gson.Gson;
import ec.edu.espe.stylesirelia.model.Customer;
import ec.edu.espe.stylesirelia.model.Product;
import ec.edu.espe.stylesirelia.model.Service;
import ec.edu.espe.stylesirelia.model.Stylist;
import ec.edu.espe.stylesirelia.model.Supplier;
import ec.edu.espe.stylesirelia.model.Turn;
import java.io.*;
import java.util.*;

/**
 *
 * @author Carlos Granda, DCCO- ESPE, Syntax Error
 * 
 *
 */
public class AdministrativeDisplay {

    public static void main(String[] args) {
        System.out.println("System of FRUIT APP DON MORALES");
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

        Product productData;
        Service servicesData;
        Stylist stylistData;
        Turn turnData;
        Customer customerData;
        Supplier supplierData;

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
        String json;

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

        Gson gson = new Gson();

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

        unitTest();

    }

    private static void printOptions() {
        System.out.println("Welcome to system Styles by Irelia");
        System.out.println("This is a options");
        System.out.println("1. Add a new customer");
        System.out.println("2. Add a new product");
        System.out.println("3. exit");
    }

    public static void unitTest() {

        boolean exit;
        Scanner textInput;
        int option;
        option = 0;
        textInput = new Scanner(System.in);
        exit = false;
        while (!exit) {
            System.out.println("----------------------------------------------------");
            printOptions();
            try {
                System.out.println("Write the one option: ");
                option = textInput.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("You selected option 1");
                        break;
                    case 2:
                        System.out.println("You selected option 1");
                        break;
                    case 3:
                        System.out.println("You are leaft");
                        exit = true;
                        break;
                    default:
                        System.out.println("Only numbers 1 ... 3");
                }
            } catch (Exception e) {
                //System.out.println(e.getMessage());
                System.out.println("Only enter the numbers");
                textInput.next();
            }

        }

    }

}
