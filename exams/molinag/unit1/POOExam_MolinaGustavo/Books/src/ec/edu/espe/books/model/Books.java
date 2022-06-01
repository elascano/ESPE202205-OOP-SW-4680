/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.books.model;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class Books {
    private String title;
    private String Autor;
    private String publisher;
    private int YearOfPublicashion;   

    
   
    @Override
    public String toString() {
        return "Books{" + "title=" + title + ", Autor=" + Autor + ", publisher=" + publisher + ", YearOfPublicashion=" + YearOfPublicashion + '}';
    }

    
   
    public Books(String title, String Autor, String publisher, int YearOfPublicashion) {
        this.title = title;
        this.Autor = Autor;
        this.publisher = publisher;
        this.YearOfPublicashion = YearOfPublicashion;
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
     * @return the Autor
     */
    private String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    private void setAutor(String Autor) {
        this.Autor = Autor;
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
     * @return the YearOfPublicashion
     */
    private int getYearOfPublicashion() {
        return YearOfPublicashion;
    }

    /**
     * @param YearOfPublicashion the YearOfPublicashion to set
     */
    private void setYearOfPublicashion(int YearOfPublicashion) {
        this.YearOfPublicashion = YearOfPublicashion;
    }
    
    
}
