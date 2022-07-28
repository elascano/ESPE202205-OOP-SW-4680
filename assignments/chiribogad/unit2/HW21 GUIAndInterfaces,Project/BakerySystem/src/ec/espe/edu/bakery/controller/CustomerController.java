package ec.espe.edu.bakery.controller;

import ec.espe.edu.bakery.model.Customer;
import utils.DataBaseManager;
import utils.Persistence;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class CustomerController {
    Persistence persistence;
    public boolean register(Customer customer){
        persistence = new DataBaseManager();
        persistence.create("customers", customer);
        
        return true;
    }
    
    public boolean update(String criterion, Customer customer){
        persistence.update("Customers", criterion, customer);
        return false;
    }
}
