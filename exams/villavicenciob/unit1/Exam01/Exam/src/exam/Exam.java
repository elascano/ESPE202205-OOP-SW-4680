
package exam;

import java.util.ArrayList;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class Exam {

    public static void main(String[] args) {
        ArrayList<Book> books;
        int sizeBooks;
        books = new ArrayList<>(); 
        
        
        for(int i=0; i<5;i++){
            books.add(i, new Book("title1", "Autho1", "Editorial1", "2022"));
        }
        sizeBooks= books.size();
        for(Book printf: books){
            System.out.println(printf);
        }
        System.out.println("Quantity of books: "+ sizeBooks);
    }
    
}
