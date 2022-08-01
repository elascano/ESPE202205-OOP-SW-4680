/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.examq61.model;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class SoccerTeam {
    private String soccerId;
    private String name;
    private String coach;
    private String color;
    private String country;

    public SoccerTeam(String soccerId, String name, String coach, String color, String country) {
        this.soccerId = soccerId;
        this.name = name;
        this.coach = coach;
        this.color = color;
        this.country = country;
    }

    /**
     * @return the soccerId
     */
    public String getSoccerId() {
        return soccerId;
    }

    /**
     * @param soccerId the soccerId to set
     */
    public void setSoccerId(String soccerId) {
        this.soccerId = soccerId;
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
     * @return the coach
     */
    public String getCoach() {
        return coach;
    }

    /**
     * @param coach the coach to set
     */
    public void setCoach(String coach) {
        this.coach = coach;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
}
