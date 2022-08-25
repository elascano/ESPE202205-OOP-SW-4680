/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singer.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class Singer {
    
    private String name;
    private int age;
    private String musicGenre;
    private String instruments;

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
     * @return the musicGenre
     */
    public String getMusicGenre() {
        return musicGenre;
    }

    /**
     * @param musicGenre the musicGenre to set
     */
    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    /**
     * @return the instruments
     */
    public String getInstruments() {
        return instruments;
    }

    /**
     * @param instruments the instruments to set
     */
    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }

    public Singer(String name, int age, String musicGenre, String instruments) {
        this.name = name;
        this.age = age;
        this.musicGenre = musicGenre;
        this.instruments = instruments;
    }

    @Override
    public String toString() {
        return "Singer{" + "name=" + name + ", age=" + age + ", musicGenre=" + musicGenre + ", instruments=" + instruments + '}';
    }

    public Singer() {
    }
    
    
}
