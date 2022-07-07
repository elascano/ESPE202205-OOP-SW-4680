package ec.edu.espe.Bookify.model;
/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Bookify {
    
    private String user;
    private String pasword;

    public Bookify(String user, String pasword) {
        this.user = user;
        this.pasword = pasword;
    }

    
    
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pasword
     */
    public String getPasword() {
        return pasword;
    }

    /**
     * @param pasword the pasword to set
     */
    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
    
    
    
    
}
