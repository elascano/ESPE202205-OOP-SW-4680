package mongocrud;

import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Table {

    private ObjectId id;
    private String name;
    private double price;

    public Table() {

    }

    public Document buildDocumentTable() {
        Document docTable = new Document();

        docTable.append("name", this.name).append("price", this.price);

        return docTable;
    }

    /**
     * @return the id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
