package ec.edu.espe.Bookify.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author H301
 */
public class Users {
    private int age;
    private String name;
    private int id;

    public Users(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public Users() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void see(){
        List <Users> user;
        user= new ArrayList<>();
    
        Set <String> names;
        names=new TreeSet<>();
        
    
    }
    
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
    
    
                
}
