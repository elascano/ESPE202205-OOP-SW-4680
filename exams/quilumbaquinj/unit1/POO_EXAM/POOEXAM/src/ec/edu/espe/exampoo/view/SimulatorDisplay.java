/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exampoo.view;

import ec.edu.espe.exampoo.model.Book;
import java.util.ArrayList;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
    ArrayList<Book> books;
    books = new ArrayList<Book>();
    
    books.add(new Book("Algebra","Baldor","Hartman",2018));
    books.add(new Book("Fisica","Juan","Universo",2017));
    books.add(new Book("Matematicas","Pedro","Agua",2014));
    books.add(new Book("Ciencias","Chayanne","Tierra",2013));
    
    
        System.out.println("Total of books:"+books.size());
        
        System.out.println(books);
    
    }
    
    
    
    
    
}
