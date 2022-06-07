package exam;

/**
 *
 * @author Carlos Rivera, DCCO- ESPE, CODEX++
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String yearPublication;

    public Book(String title, String author, String publisher, String yearPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", yearPublication=" + yearPublication + '}';
    }
}
