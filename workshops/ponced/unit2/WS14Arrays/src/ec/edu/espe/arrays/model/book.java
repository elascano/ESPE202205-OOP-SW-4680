/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arrays.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class book {
    private String titulo;
    private String autor;
    private String editorial;
    private int año;

    public book(String titulo, String autor, String editorial, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.año = año;
    }

    public book() {
        titulo = "";
        autor = "";
        editorial = "";
        año = 0;
    }

    
    @Override
    public String toString() {
        return  "Titulo = " + titulo + ", Autor = " + autor + ", Editorial = " + editorial + ", A\u00f1o = " + año + "\n";
    }

    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }
    
    
}
