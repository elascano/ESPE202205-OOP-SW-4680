package ec.edu.espe.ExamPoo.view;

import ec.edu.espe.ExamPoo.model.Books;
import java.awt.print.Book;
import java.util.ArrayList;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class BookControl {
    public static void main(String[] args) {
        ArrayList<Books> books;
        books = new ArrayList<>();
        
        books.add(new Books("Giancoli","Baldor","Horseman",2018));
        books.add(new Books("Stiwart","Vlador","Rosse",2015));
        books.add(new Books("Maths","Dep","Hartmam",2014));
        books.add(new Books("Valdor","Pearson","Adams",2018));
        books.add(new Books("Science","Juan","Litt",2018));
        
        System.out.println("total" + books.size());
        System.out.println(books);
    
    }
}
