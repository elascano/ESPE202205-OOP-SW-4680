/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.BookStore.model;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class Book {
    private String title;
    private String autor;
    private String publisher;
    private int yearOfPublication;

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", autor=" + autor + ", publisher=" + publisher + ", yearOfPublication=" + yearOfPublication + '}';
    }

    public Book() {
    }

    public Book(String title, String autor, String publisher, int yearOfPublication) {
        this.title = title;
        this.autor = autor;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
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
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
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
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    /**
     * @param yearOfPublication the yearOfPublication to set
     */
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    
    
    
}
