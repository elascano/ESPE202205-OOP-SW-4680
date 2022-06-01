/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class Book {
    private String autor;
    private String title;
    private String publisher;
    private int yearOfPublicashion;
     private ArrayList<BookObject> bookObjects;

    public Book(String autor, String title, String publisher, int yearOfPublicashion, ArrayList<BookObject> bookObjects) {
        this.autor = autor;
        this.title = title;
        this.publisher = publisher;
        this.yearOfPublicashion = yearOfPublicashion;
        this.bookObjects = bookObjects;
    }

    public Book(String titleIntroduction_to_Algorithms, String ronald_Linn_Rivest, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "book{" + "autor=" + autor + ", title=" + title + 
        ", publisher=" + publisher + ", yearOfPublicashion=" + yearOfPublicashion +
        ", bookObjects=" + bookObjects + '}';
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
     * @return the yearOfPublicashion
     */
    public int getYearOfPublicashion() {
        return yearOfPublicashion;
    }

    /**
     * @param yearOfPublicashion the yearOfPublicashion to set
     */
    public void setYearOfPublicashion(int yearOfPublicashion) {
        this.yearOfPublicashion = yearOfPublicashion;
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
     * @return the bookObjects
     */
    public ArrayList<BookObject> getBookObjects() {
        return bookObjects;
    }

    /**
     * @param bookObjects the bookObjects to set
     */
    public void setBookObjects(ArrayList<BookObject> bookObjects) {
        this.bookObjects = bookObjects;
    }
}
