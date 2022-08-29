package ec.edu.espe.stylesirelia.controller;

import ec.edu.espe.stylesirelia.model.Stylist;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class StylistController extends BasicController<Stylist> {

    public StylistController(Stylist object, String collectionName) {
        super(object, collectionName);
    }

    public StylistController() {
        super(new Stylist(), "stylists");
    }

    public Document buildDocument(Stylist stylist) {
        Document document = new Document();

        document.append("identificationCard", stylist.getIdentificationCard()).
                append("name", stylist.getName()).
                append("number", stylist.getNumber()).
                append("payment", stylist.getPayment()).
                append("service", stylist.getService()).
                append("address", stylist.getAddress());

        return document;
    }

}
