package utils;

import espe.edu.ec.model.elements;

/**
 *
 * @author QUILUMBAQUIN JAIRO,STEVEN POZO DCC0-ESPE: CODEX++
 */
public class FormsHandler {

    elements tosave;
    MongoDBManager db;

    public void saveElementsToDB(int size, int[] sorted, int[] unsorted, String sortAlgorithm) {
        tosave = new elements();
        db = new MongoDBManager();
        
        tosave.setSize(0);
        tosave.setSortAlgorithm(sortAlgorithm);
        tosave.setSorted(sorted);
        tosave.setUnsorted(unsorted);
        
        
        db.CreateObject(tosave, "Sort");

    }

}
