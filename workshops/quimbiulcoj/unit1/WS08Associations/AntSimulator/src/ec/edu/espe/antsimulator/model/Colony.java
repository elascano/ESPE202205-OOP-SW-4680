/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class Colony {
    private Nest nest;
    public void run(){
        System.out.println("The colony is runnig");
    }

    public Colony(Nest nest) {
        this.nest = nest;
    }

    @Override
    public String toString() {
        return "Colony{" + "nest=" + getNest() + '}';
    }

    /**
     * @return the nest
     */
    public Nest getNest() {
        return nest;
    }

    /**
     * @param nest the nest to set
     */
    public void setNest(Nest nest) {
        this.nest = nest;
    }
    
    
}
