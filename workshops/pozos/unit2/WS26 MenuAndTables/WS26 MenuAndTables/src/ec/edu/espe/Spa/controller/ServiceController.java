
package ec.edu.espe.Spa.controller;

import ec.edu.espe.Spa.model.Customer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class ServiceController {
    
    public int giveDisscount(int numberOfServices) {
        float price;
        float finalPrice = 0;
        int discount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola querido cliente, antes de agendar veremos si usted es merecedor de un descuento en nuestra tienda");
        System.out.println("Cuantos servicios desea agendar hoy?");
        numberOfServices = scanner.nextInt();
        if (numberOfServices <= 0) {
            System.out.println("Dato incorrecto, por favor escriba una respuesta acorde");
            discount = 0;
            return discount;
        }

        if (numberOfServices == 1) {
            System.out.println("Por el momento no aplicaremos ningun descuento para usted");
            discount = 0;
            return discount;
        }
        if (numberOfServices == 2) {
            System.out.println("Muy bien! usted recibira un pequenio descuento:");
            System.out.print("Cual es el costo de su servicio?: ");
            price = scanner.nextFloat();
            finalPrice = price * 0.05F;
            System.out.println("Su descuento es de: " + finalPrice + "$");
            discount = 5;
            return discount;
        }
        if (numberOfServices >= 3) {
            System.out.println("Muy bien! usted recibira un descuento un poco mejor");
            System.out.print("Cual es el costo de su servicio?: ");
            price = scanner.nextFloat();
            finalPrice = price * 0.10F;
            System.out.println("Su descuento es de: " + finalPrice + "$");
            discount = 10;
            return discount;

        }
        return 0;

    }

    public void chooseService() {
        int optionService;
        optionService=validateServiceMenu();
        Customer customer=new Customer();
        
            switch (optionService) {
                case 1 ->
                    System.out.println("1. Laser depilation");
                case 2 ->
                    System.out.println("2. Facial treatment");
                case 3 ->
                    System.out.println("3. Acne treatment");
                case 4 ->
                    System.out.println("4. Stain blurring");

                case 5 ->
                    System.out.println("5. Deep hydration");
                case 6 ->
                    System.out.println("6. Chemical peeling");

                case 7 ->
                    System.out.println("7. Platelet rich plasma");

                case 8 ->
                    System.out.println("8. Reduction measures");

                case 9 ->
                    System.out.println("9. Body toning");

                case 10 ->
                    System.out.println("10. Blurring of stretch marks");

                case 11 ->
                    System.out.println("11. Increasing of buttocks");

                case 12 ->
                    System.out.println("12. Ionic detox");

                case 13 ->
                    System.out.println("13. Microblanding");
            }
    }
    public void showServices(){
            System.out.println("1. Laser depilation");
            System.out.println("2. Facial treatment");
            System.out.println("3. Acne treatment");
            System.out.println("4. Stain blurring");
            System.out.println("5. Deep hydration");
            System.out.println("6. Chemical peeling");
            System.out.println("7. Platelet rich plasma");
            System.out.println("8. Reduction measures");
            System.out.println("9. Body toning");
            System.out.println("10. Blurring of stretch marks");
            System.out.println("11. Increasing of buttocks");
            System.out.println("12. Ionic detox");
            System.out.println("13. Microblanding");
            System.out.println("Choose the service you want to schedule");
    }
    public int validateServiceMenu() {
    Scanner s = new Scanner(System.in);
    int option;
    while (true) {
        showServices();
        if (s.hasNextInt()) {
            option = s.nextInt();
            if (option >= 1 && option <=13) {
                return option;
            } else {
                System.out.println("Choose an option between 1 and 4");
                System.out.println("Type again: ");
            }
        } else {
            System.out.println("The characters entered are not");
            System.out.println("Type again: ");
            s.next();
        }
    }
    
}
    public static boolean Email(String email) {
        Pattern patron = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
        Matcher comparador = patron.matcher(email);
        return comparador.find();
    }
        }

