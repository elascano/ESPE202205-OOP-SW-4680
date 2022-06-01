/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.examunit1.view;

import ec.edu.espe.examunit1.model.Book;
import java.util.ArrayList;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class Display {
    public static void main(String[] args) {
        System.out.println("this program is running");
        
        int sizeBooks;
        ArrayList<Book> books;
        
        books = new ArrayList<>();
        Book book;
         
        book = new Book("Amanecer rojo","Pierce Brown","editorial1","publishingdate1");
        book = new Book("Saltamontes va de viaje","Arnold Lobel","Kalandraka","publishingdate2");
        book = new Book("La merienda del parque","Pablo Albo y Cecilia Moreno","Narval editores ","publishingdate3");
        book = new Book("Empanada de mamut","Jeanne Willis y Tony Ross","Libros del Zorro Rojo ","publishingdate4");
        
        for(int i=0;i<5;i++){
          books.add(new Book("Amanecer rojo","Pierce Brown","editorial1","publishingdate1"));
        }
        sizeBooks= books.size();
        for(Book printf: books){
            System.out.println(printf);
        }
        System.out.println("Number of books: "+ sizeBooks);
    }
}
