/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
class Persona {
private int id;
private String name;private String cuorse;

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", name=" + name + ", cuorse=" + cuorse + '}';
    }

    public Persona(int id, String name, String cuorse) {
        this.id = id;
        this.name = name;
        this.cuorse = cuorse;
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
     * @return the cuorse
     */
    public String getCuorse() {
        return cuorse;
    }

    /**
     * @param cuorse the cuorse to set
     */
    public void setCuorse(String cuorse) {
        this.cuorse = cuorse;
    }

}


