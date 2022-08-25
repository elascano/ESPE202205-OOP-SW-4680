/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author Jose Imbaqinga, Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class LibraryJson{
    private String title;
    private String author;
    private String editorial;
    private String publishingDate;

    public LibraryJson(String title, String author, String editorial, String publishingDate) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.publishingDate = publishingDate;
    }

    @Override
    public String toString() {
        return title+";"+author+";"+editorial+";"+publishingDate;
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

    /**
     * @return the publishingDate
     */
    public String getPublishingDate() {
        return publishingDate;
    }

    /**
     * @param publishingDate the publishingDate to set
     */
    public void setPublishingDate(String publishingDate) {
        this.publishingDate = publishingDate;
    }
    
    
}