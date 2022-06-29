package edu.espe.ec.csv.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class BookStore {

    private String id;
    private String author;
    private String title;
    private String editorial;

    public BookStore(String id, String author, String title, String editorial) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.editorial = editorial;
    }

    public String toCsv() {
        return this.id + "," + this.author + "," + this.title + "," + this.editorial;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
