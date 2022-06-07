package ec.edu.espe.book.view;
import ec.edu.espe.book.model.book;
import java.awt.print.Book;
import java.util.ArrayList;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        ArrayList<Book> books;
        int sizeBooks;
        books = new ArrayList<>();
        
{
        System.out.println(books.add( new book( "Odisea", "Homero", "1906")));
    }
    sizeBooks = books.size();
    books.forEach(_item -> {
        System.out.println("Quantity of books: "+ sizeBooks);
        });
    }
    
}
