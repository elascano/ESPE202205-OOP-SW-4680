package ec.edu.espe.arrays.view;

import ec.edu.espe.arrays.model.book;
import java.util.Iterator;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class WS14Arrays {
    
    public static void main(String[] args) {
        book[] books=new book[4];
        books[0]= new book("Clean Code", "Robert Cecil Martin", "Pearson Education", 2008);
        books[1]= new book("The Pragmatic Programmer", "Robert Cecil Martin", "Pearson Education", 2008);
        books[2]= new book("Code Complete", "Steve McConnell", "Microsoft Press", 1993);
        books[3]= new book("The Mythical Man-Month", "Fred Brooks", "Addison-Wesley", 1975);
        
        for(int i = 0; i < 4; i++){
            System.out.println("book"+ (i+1)+" -> "+ books[i]);
        }
        
        
    }
    
}
