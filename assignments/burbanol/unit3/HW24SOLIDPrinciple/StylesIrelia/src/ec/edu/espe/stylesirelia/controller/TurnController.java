package ec.edu.espe.stylesirelia.controller;

import ec.edu.espe.stylesirelia.model.Turn;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class TurnController extends BasicController<Turn> {

    public TurnController(Turn object, String collectionName) {
        super(object, collectionName);
    }
    public TurnController() {
        super(new Turn(), "turns");
    }
    

    public Document buildDocument(Turn  turn) {
        Document document = new Document();

        document.append("id", turn.getId()).
                append("date", turn.getDate()).
                append("customer", turn.getCustomer()).
                append("service", turn.getService());
                

        return document;
    }
}
