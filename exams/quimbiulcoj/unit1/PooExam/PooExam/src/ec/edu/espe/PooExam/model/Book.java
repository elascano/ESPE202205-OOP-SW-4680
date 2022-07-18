/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.PooExam.model;

/**
 *
 * @author Group 01 PITFALLS Embedded Types in Names, DCCO-ESPE
 */
public class Book {
    private String title;
    private String autor;
    private String publisher;
    private int yearOfPublicashion;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublicashion() {
        return yearOfPublicashion;
    }

    public void setYearOfPublicashion(int yearOfPublicashion) {
        this.yearOfPublicashion = yearOfPublicashion;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", autor=" + autor + ", publisher=" + publisher + ", yearOfPublicashion=" + yearOfPublicashion + '\n';
    }
    
    

    public Book(String title, String autor, String publisher, int yearOfPublicashion) {
        this.title = title;
        this.autor = autor;
        this.publisher = publisher;
        this.yearOfPublicashion = yearOfPublicashion;
    }
    
    
    
}
