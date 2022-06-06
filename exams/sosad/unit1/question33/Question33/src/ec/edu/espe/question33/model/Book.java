/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.question33.model;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Book {
    private char title;
    private char author;
    private char publisher;
    private int yearofpublication;

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", yearofpublication=" + yearofpublication + '}';
    }
    

    public Book(char title, char author, char publisher, int yearofpublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearofpublication = yearofpublication;
    }

    public char getTitle() {
        return title;
    }

    public void setTitle(char title) {
        this.title = title;
    }

    public char getAuthor() {
        return author;
    }

    public void setAuthor(char author) {
        this.author = author;
    }

    public char getPublisher() {
        return publisher;
    }

    public void setPublisher(char publisher) {
        this.publisher = publisher;
    }

    public int getYearofpublication() {
        return yearofpublication;
    }

    public void setYearofpublication(int yearofpublication) {
        this.yearofpublication = yearofpublication;
    }
    

}
