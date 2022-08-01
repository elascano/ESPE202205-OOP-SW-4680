package ec.edu.espe.bookifitables.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", genre=" + genre + '}';
    }

    public void see(){
        List<Book> books;
        books = new ArrayList<>();
    }
    public Book() {
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
     * @return the pages
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the pages to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    
}
