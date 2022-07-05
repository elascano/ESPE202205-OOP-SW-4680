package pruebamongodb;

import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class Pen {

    private String marca;
    private ObjectId _id;

    public Pen() {

    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public Document buildDocument() {
        Document PenDoc = new Document();
        PenDoc.append("marca", this.marca);
        return PenDoc;
    }

    public String getTitle() {
        return marca;
    }

    public void setTitle(String marca) {
        this.marca = marca;
    }

}
