
package exam;

import java.util.ArrayList;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Book> books;
        int sizeBooks;
        books = new ArrayList<>();
        
        
       
        
        for(int i=0; i<10;i++){
            books.add(i, new Book("title1", "Autho1", "Editorial1", "2022"));
        }
        sizeBooks= books.size();
        
        
        
        for(Book printf: books){
            System.out.println(printf);
        }
        System.out.println("Quanty of book"+sizeBooks);
    
    }
}
