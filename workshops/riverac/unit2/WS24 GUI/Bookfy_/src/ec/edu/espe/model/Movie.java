package ec.edu.espe.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Movie {
    private String title;
    private String genre;
    private String idiom;

    public Movie(String title, String genre, String idiom) {
        this.title = title;
        this.genre = genre;
        this.idiom = idiom;
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
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the idiom
     */
    public String getIdiom() {
        return idiom;
    }

    /**
     * @param idiom the idiom to set
     */
    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }

}