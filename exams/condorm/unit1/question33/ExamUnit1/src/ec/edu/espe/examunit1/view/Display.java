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
        
        
        ArrayList<Book> books;
        
        books = new ArrayList<>();
        int sizeBooks = 0;
         
        books.add(new Book("Amanecer rojo","Pierce Brown","editorial1","publishingdate1"));
        books.add(new Book("Saltamontes va de viaje","Arnold Lobel","Kalandraka","publishingdate2"));
        books.add(new Book("La merienda del parque","Pablo Albo y Cecilia Moreno","Narval editores ","publishingdate3"));
        books.add(new Book("Empanada de mamut","Jeanne Willis y Tony Ross","Libros del Zorro Rojo ","publishingdate4"));
        
        sizeBooks = books.size();
        for(int i=0;i<sizeBooks;i++){
            System.out.println("book -->"+ books.get(i));
        }
    }
}
