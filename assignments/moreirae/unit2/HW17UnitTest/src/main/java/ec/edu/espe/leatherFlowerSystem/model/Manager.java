package ec.edu.espe.leatherFlowerSystem.model;

/**
 *
 * @author Steven Pozo,Erick Moreira,Elkin Pabón,Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class Manager {
   private String userName;
   private String password;

//    public Manager(String userName, String password) {
//        this.userName = userName;
//        this.password = password;
//    }
    public Manager(){
        
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void logIn(String userName,String password){
      
    }
}

