package exam.arguello.j.pkg4680;

import java.awt.print.Book;
import java.util.ArrayList;


/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class ExamArguelloJ4680 {

    public static void main(String[] args) {
        ArrayList<Book> books;
        int sizeBooks;
        books = new ArrayList<>(); 
        for(int i=0; i<10;i++){
            books.add(i, new Book("Title/Book", "Author/Book", "Editorial/Book", "Publication year"));
        }
        sizeBooks= books.size();
        for(Book printf: books){
            System.out.println(printf);
        }
    System.out.println("Books in the library: "+sizeBooks)
    }
    
     
    
