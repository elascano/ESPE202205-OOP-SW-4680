
package es.edu.espe.mainFile.view;

import ec.edu.espe.FileManager.model.Book;
import ec.edu.espe.utils.FileManager;


/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class MainFile {

 
    public static void main(String[] args) {
          
        Book book = new Book("In the American Grain", "William Carlos Williams", 1684221498);
        FileManager.modifyBook(book);
        FileManager.createJson(book);
    }
    
}
