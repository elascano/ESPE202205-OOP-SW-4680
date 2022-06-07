
package exam;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String yearOfPublication;

    public Book(String title, String author, String publisher, String yearPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", yearPublication=" + yearOfPublication + '}';
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
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the yearPublication
     */
    public String getYearPublication() {
        return yearOfPublication;
    }

    /**
     * @param yearPublication the yearPublication to set
     */
    public void setYearPublication(String yearPublication) {
        this.yearOfPublication = yearPublication;
    }
    
    
}
