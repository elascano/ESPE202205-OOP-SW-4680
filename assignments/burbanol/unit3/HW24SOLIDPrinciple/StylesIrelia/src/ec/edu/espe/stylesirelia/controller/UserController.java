package ec.edu.espe.stylesirelia.controller;

import ec.edu.espe.stylesirelia.model.User;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class UserController extends BasicController<User> {

    public UserController(User object, String collectionName) {
        super(object, collectionName);
    }

    public UserController() {
        super(new User(), "users");
    }
    public Document buildDocument(User user) {
        Document document = new Document();
        document.append("user", user.getUser()).
                append("password", user.getPassword());

        return document;
    }
}
