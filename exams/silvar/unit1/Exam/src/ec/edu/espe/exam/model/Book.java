package ec.edu.espe.exam.model;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class Book {
   
    private String title;
    private String Autor;
    private String publisher;
    private int YearOfPublication;

    public Book(String title, String Autor, String publisher, int YearOfPublication) {
        this.title = title;
        this.Autor = Autor;
        this.publisher = publisher;
        this.YearOfPublication = YearOfPublication;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the YearOfPublication
     */
    public int getYearOfPublication() {
        return YearOfPublication;
    }

    /**
     * @param YearOfPublication the YearOfPublication to set
     */
    public void setYearOfPublication(int YearOfPublication) {
        this.YearOfPublication = YearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", Autor=" + Autor + ", publisher=" + publisher + ", YearOfPublication=" + YearOfPublication + '\n';
    }

            
}
        
    

