/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import ec.edu.espe.BookStore.model.Book;
import ec.edu.espe.BookStore.model.BookList;


/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class BookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BookList list = new BookList();
                
        Book book1 = new Book("Viaje al Centro de la Tierra","Juelio Verne","Editorial",1960);
        Book book2 = new Book("Luces de Bohemia","Ramon del Valle","Editorial",1970);
        Book book3 = new Book("Crimen y Castigo","Fedor Dostoievski","Editorial",1960);
        Book book4 = new Book("100 años de soledad","Gabriel Garcia Marquez","Editorial",1960);
        Book book5 = new Book("La casa de los Espiritus","Isabel Allende","Editorial",1960);
        
        list.addBook(book1);
        list.addBook(book2);
        list.addBook(book3);
        list.addBook(book4);
        list.addBook(book5);
        
        list.printBook();
        System.out.println("Size's List ->>> "+list.sizeList());
        
        
        
        
        
    }
    
}
