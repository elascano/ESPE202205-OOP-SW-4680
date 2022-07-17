package ec.edu.espe.book.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String yearOfPúblication;
    private String ISBN;

    public Book(String title, String author, String publisher, String yearOfPúblication, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPúblication = yearOfPúblication;
        this.ISBN = ISBN;
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
     * @return the yearOfPúblication
     */
    public String getYearOfPúblication() {
        return yearOfPúblication;
    }

    /**
     * @param yearOfPúblication the yearOfPúblication to set
     */
    public void setYearOfPúblication(String yearOfPúblication) {
        this.yearOfPúblication = yearOfPúblication;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
}
