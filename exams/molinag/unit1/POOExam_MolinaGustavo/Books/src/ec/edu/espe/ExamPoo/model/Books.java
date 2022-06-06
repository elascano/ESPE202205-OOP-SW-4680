/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ExamPoo.model;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class Books {
    private String title;
    private String autor;
    private String publisher;
    private int yearOfPublicashion;

    
    public Books(String title, String autor, String publisher, int yearOfPublicashion) {
        this.title = title;
        this.autor = autor;
        this.publisher = publisher;
        this.yearOfPublicashion = yearOfPublicashion;
    }

    /**
     * @return the title
     */
    private String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    private void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the autor
     */
    private String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    private void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the publisher
     */
    private String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the yearOfPublicashion
     */
    private int getYearOfPublicashion() {
        return yearOfPublicashion;
    }

    /**
     * @param yearOfPublicashion the yearOfPublicashion to set
     */
    private void setYearOfPublicashion(int yearOfPublicashion) {
        this.yearOfPublicashion = yearOfPublicashion;
    }

    @Override
    public String toString() {
        return "Books{" + "title=" + title + ", autor=" + autor + ", publisher=" + publisher + ", yearOfPublicashion=" + yearOfPublicashion + '\n';
    }
    
    
    
}
