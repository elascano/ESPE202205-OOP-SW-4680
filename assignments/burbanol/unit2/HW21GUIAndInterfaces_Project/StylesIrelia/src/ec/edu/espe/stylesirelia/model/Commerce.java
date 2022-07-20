package ec.edu.espe.stylesirelia.model;

import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Commerce extends BasicModel {

    private String name;
    private String direction;

    @Override
    public Document buildDocument() {
        Document document = new Document();

        document.append("name", this.name).
                append("direction", this.direction);
        return document;
    }

    public Commerce(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Commerce{" + "name=" + name + ", direction=" + direction + '}';
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
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

}
