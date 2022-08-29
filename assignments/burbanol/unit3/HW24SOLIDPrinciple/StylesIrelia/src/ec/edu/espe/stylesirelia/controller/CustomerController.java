package ec.edu.espe.stylesirelia.controller;

import ec.edu.espe.stylesirelia.model.Customer;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class CustomerController extends BasicController<Customer> {

    public CustomerController(Customer object, String collectionName) {
        super(object, collectionName);
    }

    public CustomerController() {
        super(new Customer(), "customers");
    }
    public Document buildDocument(Customer customer) {
        Document document = new Document();

        document.append("identificationCard", customer.getIdentificationCard()).
                append("name", customer.getName()).
                append("number", customer.getNumber()).
                append("pendingPayment", customer.isPendingPayment()).
                append("appointment", customer.getAppointment()).
                append("address", customer.getAddress());

        return document;
    }
}
