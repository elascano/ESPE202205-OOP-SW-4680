package pruebamongodb;

import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Book {

    private String title;
    private ObjectId _id;

    public Book() {

    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public Document buildDocument() {
        Document bookDoc = new Document();
        bookDoc.append("title", this.title);
        return bookDoc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
