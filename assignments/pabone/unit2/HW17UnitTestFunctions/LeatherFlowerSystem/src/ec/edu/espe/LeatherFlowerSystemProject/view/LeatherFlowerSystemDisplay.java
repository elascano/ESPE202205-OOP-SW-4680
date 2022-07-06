package ec.edu.espe.LeatherFlowerSystemProject.view;
import ec.edu.espe.LeatherFlowerSystemProject.model.Customer;
import ec.edu.espe.LeatherFlowerSystemProject.model.Manager;
//import ec.edu.espe.LeatherFlowerSystemProject.model.MongoDBConnection;
import ec.edu.espe.LeatherFlowerSystemProject.model.Service;

import java.util.Scanner;

/**
 *
 * @author Steven Pozo, Elkin Pabon, Erick Moreira, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class LeatherFlowerSystemDisplay {

    public static void main(String[] args) {
      
        Manager manager;
        manager =new Manager();
        Service service;
        service =new Service();
        Customer customer = new Customer();
        customer.deferAppointment();
        
    }
    
    

}

