/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String yearPublication;

    public Book(String title, String author, String publisher, String yearPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", yearPublication=" + yearPublication + '}';
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
        return yearPublication;
    }

    /**
     * @param yearPublication the yearPublication to set
     */
    public void setYearPublication(String yearPublication) {
        this.yearPublication = yearPublication;
    }
    
    
}
