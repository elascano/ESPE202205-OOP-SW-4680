/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.stylesirelia.model;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class Turn {
    private int id;
    private String date;

    public Turn(int id, String date) {
        this.id = id;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Turn{" + "id=" + id + ", date=" + date + '}';
    }
    
    
    public void addTurn(){
        
    }
    public void editTurn(){
        
    }
    public void removeTurn(){
        
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
}
