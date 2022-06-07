package ec.edu.espe.book.model;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class book {

    String tittle;
    int amount;
    String edition;
    int age;

    public book(String odisea, String homero, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "book{" + "tittle=" + tittle + ", amount=" + amount + ", edition=" + edition + ", age=" + age + '}';
    }

    public book(String tittle, int amount, String edition, int age) {
        this.tittle = tittle;
        this.amount = amount;
        this.edition = edition;
        this.age = age;
    }

}
