
package ec.edu.espe.LeatherFlowerSystemProject.view;
import ec.edu.espe.LeatherFlowerSystemProject.model.Customer;
import ec.edu.espe.LeatherFlowerSystemProject.model.Manager;
import ec.edu.espe.LeatherFlowerSystemProject.model.MongoDBConnection;
import ec.edu.espe.LeatherFlowerSystemProject.model.Service;

import java.util.Scanner;


/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class LeatherFlowerSystemDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MongoDBConnection mongoDBConnection;
        mongoDBConnection = new MongoDBConnection();
        Manager manager;
        manager =new Manager();
        Service service;
        service =new Service();
        Customer customer = new Customer();
      //  service.giveDisscount(2);
      //  service.chooseService(0);
          //  customer.scheduleAppointment();
//        int discount = giveDiscount(0);
//        System.out.println(discount + "%");
        
//        mongoDBConnection.conectionMongo();
//        manager.logIn();
        principalMenu();
        
      //  validateData();
        
    }
    
    //FUNTIONS:
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
        
    public static void validateData(){
        String cadenaUno = "dfsdfds";
        if (isNumeric(cadenaUno))
            System.out.println(cadenaUno + " es un numero");
        else
            System.out.println(cadenaUno + " NO es un numero");
     
    }
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
}