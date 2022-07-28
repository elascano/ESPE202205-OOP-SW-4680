package ec.edu.espe.PooExam.view;

import ec.edu.espe.PooExam.model.Book;
import java.util.ArrayList;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class BookDisplay {
    public static void main(String[] args) {
        ArrayList<Book> books;
        books=new ArrayList<Book>();
        
        books.add(new Book("Calculo","Swaumm","hp" ,2015));
        books.add(new Book("Poo","Edison.L","pp",2015));
        books.add(new Book("Fundamentos Programacion","Fred.c","hop",2015));
         books.add(new Book("Fundamentos Algebra","Fred.c","hopa",2015));
        
        System.out.println("Total of books"+books.size());
        System.out.println(books);
    }
    
}


