
package ec.edu.espe.ExamPoo.model;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Book {
    private String title;
    private String autor;
    private String publisher;
    private String yearOfPublicashion;

    public Book(String title, String autor, String publisher, String yearOfPublicashion) {
        this.title = title;
        this.autor = autor;
        this.publisher = publisher;
        this.yearOfPublicashion = yearOfPublicashion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYearOfPublicashion() {
        return yearOfPublicashion;
    }

    public void setYearOfPublicashion(String yearOfPublicashion) {
        this.yearOfPublicashion = yearOfPublicashion;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + getTitle() + ", autor=" + getAutor() + ", publisher=" + getPublisher() + ", yearOfPublicashion=" + getYearOfPublicashion() + '}';
    }
    
    
}
