/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.edu.espe.antisimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class Books {
    private int year;
    private String title;
    private String editorial;
    private String autor;

    public Books(int i, String the_Adventures_of_Pinochio, String string, String carlo_Collodi, ArrayList<Books> pinocho) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Books(int year, String title, String editorial, String autor) {
        this.year = year;
        this.title = title;
        this.editorial = editorial;
        this.autor = autor;
    }

    public Books() {
    }

    @Override
    public String toString() {
        return "Books{" + "year=" + year + ", title=" + title + ", editorial=" + editorial + ", autor=" + autor + '}';
    }
    
}
