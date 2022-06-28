/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public abstract class Animal {
    private int id;
    private String description;
    private String Cage;

    public Animal(int id, String description, String Cage) {
        this.id = id;
        this.description = description;
        this.Cage = Cage;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", description=" + description + ", Cage=" + Cage + '}';
    }
    
    public abstract void feed();
    public abstract void addToZoo(Zoo zoo);

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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the Cage
     */
    public String getCage() {
        return Cage;
    }

    /**
     * @param Cage the Cage to set
     */
    public void setCage(String Cage) {
        this.Cage = Cage;
    }
    
}
