
package exam;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Book {
        String title;
        String Author; 
        String Publisher; 
        String yearPublication;

    public Book(String title, String Author, String Publisher, String yearPublication) {
        this.title = title;
        this.Author = Author;
        this.Publisher = Publisher;
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", Author=" + Author + ", Publisher=" + Publisher + ", yearPublication=" + yearPublication + '}';
    }
    
    



        
}
