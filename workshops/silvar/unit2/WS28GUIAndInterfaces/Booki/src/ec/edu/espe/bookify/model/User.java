package ec.edu.espe.bookify.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class User {

    private int id;
    private String name;
    private int cellPhone;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cellPhone
     */
    public int getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", cellPhone=" + cellPhone + '}';
    }

    public User(int id, String name, int cellPhone) {
        this.id = id;
        this.name = name;
        this.cellPhone = cellPhone;
    }

    public User() {
    }


}
