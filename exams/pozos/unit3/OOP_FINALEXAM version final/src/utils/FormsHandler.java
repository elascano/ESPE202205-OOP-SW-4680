package utils;

import espe.edu.ec.model.elements;

/**
 *
 * @author QUILUMBAQUIN JAIRO,STEVEN POZO DCC0-ESPE: CODEX++
 */
public class FormsHandler {

    MongoDBManager db;

    public void saveElementsToDB(elements tosave) {
        
        db = new MongoDBManager();
        db.CreateObject(tosave, "Sort");

    }

}
