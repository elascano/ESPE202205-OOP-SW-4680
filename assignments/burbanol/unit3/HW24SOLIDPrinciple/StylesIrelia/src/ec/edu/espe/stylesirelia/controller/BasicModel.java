package ec.edu.espe.stylesirelia.controller;

import com.mongodb.client.result.DeleteResult;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public abstract class BasicModel {

    public abstract void create(Document document)  ;
    public abstract Document read(String id, String fieldName);
    public abstract Document read(Document document);
    public abstract DeleteResult delete(String id, Object idValue);
    public abstract void update(String id, String idValue, String updateKey, String valueUpdate);
    public abstract void update(Document query, Document upload);

    
}
