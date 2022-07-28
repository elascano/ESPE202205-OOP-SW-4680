package ec.edu.espe.styliesirelia.controller;

import ec.edu.espe.styliesirelia.model.Customer;
import utils.DataBaseManager;
import utils.Persistence;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class CustomerController {

    Persistence persistence = new DataBaseManager();

    public boolean register(Customer customer) {
        
        persistence.create("Customer", customer);
        return true;
    }

    public boolean update(String criterion, Customer customer) {
        persistence.update("Customers", criterion, customer);
        return true;
    }
}
