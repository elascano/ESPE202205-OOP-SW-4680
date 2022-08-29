package utils;

import espe.edu.ec.model.elements;

/**
 *
 * @author Diego Ponce
 */
public class FormsHandler {

    MongoDBManager db;

    public void saveElementsToDB(elements tosave) {
        
        db = new MongoDBManager();
        db.CreateObject(tosave, "Sort");

    }

}
