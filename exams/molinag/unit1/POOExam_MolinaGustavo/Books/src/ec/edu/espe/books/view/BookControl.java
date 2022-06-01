package ec.edu.espe.books.view;

import ec.edu.espe.books.model.Books;
import java.awt.print.Book;
import java.util.ArrayList;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class BookControl {
    public static void main(String[] args) {
        ArrayList<Book> books;
        books = new ArrayList<>();
        
        books.add(new Books("Giancoli","Baldor","Horseman",2018));
        books.add(new Books("Stiwart","Vlador","Rosse",2015));
        books.add(new Books("Maths","Henrry","Hartman",2014));
        books.add(new Books("Giancoli","Baldor","Horseman",2018));
        books.add(new Books("Giancoli","Baldor","Horseman",2018));
    }
}
