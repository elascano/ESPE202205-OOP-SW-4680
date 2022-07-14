
package ec.edu.espe.LeatherFlower.controller;

import ec.edu.espe.LeatherFlower.model.Customer;
import utils.DatabaseManager;
import utils.Persistence;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class CustomerController {
    Persistence persistence;
    public boolean register(Customer customer){
        persistence = new DatabaseManager();
        persistence.create("customers",customer);
      
        return true;
    }
    public boolean update(String criterion,Customer customer){
        persistence.update("customers",criterion,customer);
        return true;
    }
}
