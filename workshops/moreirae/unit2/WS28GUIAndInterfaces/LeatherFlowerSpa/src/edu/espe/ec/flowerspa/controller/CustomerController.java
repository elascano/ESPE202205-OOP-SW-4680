
package edu.espe.ec.flowerspa.controller;

import edu.espe.ec.flowerspa.model.Customer;
import utils.DataBaseManager;
import utils.Persistence;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class CustomerController {
    public boolean register(Customer customer){
        Persistence persistence = new DataBaseManager();
        persistence.create("customers", customer);
        return true;
    }
}
