/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Q1.model;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Singer {
    private String name;
    private String artisticName;
    private String Id;
    private String age;
    private String phone;

    public Singer(String name, String artisticName, String Id, String age, String phone) {
        this.name = name;
        this.artisticName = artisticName;
        this.Id = Id;
        this.age = age;
        this.phone = phone;
    }

    public Singer() {
        
    }

    @Override
    public String toString() {
        return "Singer{" + "name=" + name + ", artisticName=" + artisticName + ", Id=" + Id + ", age=" + age + ", phone=" + phone + '}';
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
     * @return the artisticName
     */
    public String getArtisticName() {
        return artisticName;
    }

    /**
     * @param artisticName the artisticName to set
     */
    public void setArtisticName(String artisticName) {
        this.artisticName = artisticName;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
}
