
package ec.edu.espe.books.model;

import java.util.ArrayList;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES Developers
 */
public class BookOfInterest {
    
    private int title;
    private int author;
    private int publisher;
    private int yearOfPublication;
    private ArrayList<book> books;

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getPublisher() {
        return publisher;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public ArrayList<book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<book> books) {
        this.books = books;
    }
    

    @Override
    public String toString() {
        return "BookOfInterest{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", yearOfPublication=" + yearOfPublication + ", books=" + books + '}';
    }
    
    public BookOfInterest(int title, int author, int publisher, int yearOfPublication, ArrayList<book> books) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.books = books;
    }
}
