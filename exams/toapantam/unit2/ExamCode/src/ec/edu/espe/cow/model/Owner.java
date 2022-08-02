package ec.edu.espe.cow.model;

/**
 *
* @author Martín Toapanta, ESPE DCCO, MyWayCode
 */
public class Owner {
    private String name;
    private String user;
    private String password;

    public Owner(String name, String user, String password) {
        this.name = name;
        this.user = user;
        this.password = password;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
