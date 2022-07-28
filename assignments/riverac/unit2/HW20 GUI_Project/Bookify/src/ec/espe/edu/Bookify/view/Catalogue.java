package ec.espe.edu.Bookify.view;

import ec.edu.espe.Bookify.model.Book;
import java.util.ArrayList;

/**
 *
 * @author QUILUMBAQUIN JAIRO,QUIMBIULCO JUAN,RAUL SILVA,CARLOS RIVERA, DCC0-ESPE: CODEX++
 */
public class Catalogue {
    public void showCatalogue(){
        System.out.println("============= Catalogue =============\n");
        ArrayList<Book>books;
        books = new ArrayList<>();
        
        Book book;
        
        book = new Book("El gran Gatsby", "4.5", "Ficcition western", "F. Scott Fitzgerald", "1925", "Milano", 180, 180000, 44, true);
        books.add(book);
        book = new Book("Moby-Dick", "3.5", "Adventure fiction", "Herman Melville", "1851", "Richard Bentley", 378, 180001, 35, true);
        books.add(book);
        book = new Book("Don Quixote", "4.5", "Novel", "Miguel de Cervantes", "1605", "Francisco de Robles", 928, 180002, 60, true);
        books.add(book);
        book = new Book("Fifty Shades of Grey", "2.5", "Romance", "E.L. James", "2011", "Vintage", 514, 180003, 0, false);
        books.add(book);
        
        for (int i=0; i < books.size();i++){
            System.out.println("\tbook " + (i+1) + books.get(i));
        }
    
                
    }
}

