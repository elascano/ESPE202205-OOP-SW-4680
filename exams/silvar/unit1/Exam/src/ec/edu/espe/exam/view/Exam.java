/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.exam.view;

import ec.edu.espe.exam.model.Book;
import java.util.ArrayList;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class Exam {


    public static void main(String[] args) {
        ArrayList<Book> books;
        books=new ArrayList<Book>();
        
        books.add(new Book("c++","Horseman","Baldor",2018));
        books.add(new Book("Ensamblaje","Pepe","Universo",2018));
        books.add(new Book("Música","Lascano","ewqr",2018));
        books.add(new Book("Poo","Paco","uwu",2018));
            
            System.out.println("total"+books.size());
            System.out.println(books);
    }
    
}
