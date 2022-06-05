package books;

import java.util.ArrayList;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Books {
    private int BloodofCahmpios;
    private int HoundOfTheBaskervilles;
    private int RomeoAndJuliet;
    private int OlimpicGods;
    private int Gosts;
    private ArrayList<Books> books;

    public Books(int BloodofCahmpios, int HoundOfTheBaskervilles, int RomeoAndJuliet, int OlimpicGods, int Gosts, ArrayList<Books> books) {
        this.BloodofCahmpios = BloodofCahmpios;
        this.HoundOfTheBaskervilles = HoundOfTheBaskervilles;
        this.RomeoAndJuliet = RomeoAndJuliet;
        this.OlimpicGods = OlimpicGods;
        this.Gosts = Gosts;
        this.books = books;
    }
    
    
    public void run(){
        System.out.println("These are the books" + getBooks());
    }

    /**
     * @return the BloodofCahmpios
     */
    public int getBloodofCahmpios() {
        return BloodofCahmpios;
    }

    /**
     * @param BloodofCahmpios the BloodofCahmpios to set
     */
    public void setBloodofCahmpios(int BloodofCahmpios) {
        this.BloodofCahmpios = BloodofCahmpios;
    }

    /**
     * @return the HoundOfTheBaskervilles
     */
    public int getHoundOfTheBaskervilles() {
        return HoundOfTheBaskervilles;
    }

    /**
     * @param HoundOfTheBaskervilles the HoundOfTheBaskervilles to set
     */
    public void setHoundOfTheBaskervilles(int HoundOfTheBaskervilles) {
        this.HoundOfTheBaskervilles = HoundOfTheBaskervilles;
    }

    /**
     * @return the RomeoAndJuliet
     */
    public int getRomeoAndJuliet() {
        return RomeoAndJuliet;
    }

    /**
     * @param RomeoAndJuliet the RomeoAndJuliet to set
     */
    public void setRomeoAndJuliet(int RomeoAndJuliet) {
        this.RomeoAndJuliet = RomeoAndJuliet;
    }

    /**
     * @return the OlimpicGods
     */
    public int getOlimpicGods() {
        return OlimpicGods;
    }

    /**
     * @param OlimpicGods the OlimpicGods to set
     */
    public void setOlimpicGods(int OlimpicGods) {
        this.OlimpicGods = OlimpicGods;
    }

    /**
     * @return the Gosts
     */
    public int getGosts() {
        return Gosts;
    }

    /**
     * @param Gosts the Gosts to set
     */
    public void setGosts(int Gosts) {
        this.Gosts = Gosts;
    }

    /**
     * @return the books
     */
    public ArrayList<Books> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(ArrayList<Books> books) {
        this.books = books;
    }
}

