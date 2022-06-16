
package ec.edu.espe.FileManager.model;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Book {
    private String title;
    private String author;
    private int ibm;

    public Book(String title, String author, int ibm) {
        this.title = title;
        this.author = author;
        this.ibm = ibm;
    }
    public Book(){
        
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIbm() {
        return ibm;
    }

    public void setIbm(int ibm) {
        this.ibm = ibm;
    }
}
