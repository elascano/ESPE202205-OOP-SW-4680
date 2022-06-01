
package ec.edu.espe.antsimulator.view;


import ec.edu.espe.antsimulator.model.Book;
import java.util.ArrayList;



/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class CodingSkills {
    public static void main(String[] args) {
        ArrayList<Book>books;
        books=new ArrayList<>();
        
        
        
       
        
        
       books.add(new Book("Introduction to Algorithms", "Ronald Linn Rivest", "2022"));
       books.add(new Book("Code Complete (2ª edición)", "Steve McConell", "1993"));
       books.add(new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma", "1998"));
       books.add(new Book("The Mythical Man-Month", "Freederick", "1995"));
        
       
        System.out.println("List Books: "+books.size());
        System.out.println(books);
       
        
    }

    
    
}
