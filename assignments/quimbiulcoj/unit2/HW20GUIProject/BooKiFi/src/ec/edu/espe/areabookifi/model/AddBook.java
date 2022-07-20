/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.areabookifi.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class AddBook {
    private String title;
    private String author;
    private String publisher;
    private String yearOfPublication;
    private String isbn;
    private boolean avaliable;

    public AddBook(String title, String author, String publisher, String yearOfPublication, String isbn, boolean avaliable) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.isbn = isbn;
        this.avaliable = avaliable;
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
     * @return the yearOfPublication
     */
    public String getYearOfPublication() {
        return yearOfPublication;
    }

    /**
     * @param yearOfPublication the yearOfPublication to set
     */
    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the avaliable
     */
    public boolean isAvaliable() {
        return avaliable;
    }

    /**
     * @param avaliable the avaliable to set
     */
    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }
    
    
}
